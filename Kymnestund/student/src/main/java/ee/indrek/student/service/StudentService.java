package ee.indrek.student.service;

import ee.indrek.student.model.Student;
import ee.indrek.student.model.Subject;
import ee.indrek.student.repository.StudentRepository;
import ee.indrek.student.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
        System.out.println("Lisatud student: " + student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if(!exists) {
            throw new IllegalStateException("Student ID-ga " + studentId + " pole olemas, ei saa kustutada");
        }
        studentRepository.deleteById(studentId);
        System.out.println("Student edukalt kustutatud");
    }

    public void registerNewStudent(Student student) {
        //kontroll emaili järgi, kas see student on juba olemas
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()) {
            throw new IllegalStateException("Email olemas, ei saa lisada");
        }
        studentRepository.save(student);
        System.out.println("Lisatud: " + student);

    }

    @Transactional //ei kasuta jpqa query, vaid saame settereid kasutada
    public void updateStudent(Long studentId, Student newStudent) {
        System.out.println("Proovin uuendada studentit ID-ga " + studentId);
        Student existingStudent = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Studentit ei leitud"));

        //kontrollid
        if(newStudent.getName() != null && !newStudent.getName().isEmpty()) {
            existingStudent.setName(newStudent.getName());
        }
        if(newStudent.getEmail() != null && !newStudent.getEmail().isEmpty()) {
            if(!newStudent.getEmail().equals(existingStudent.getEmail())
                    && studentRepository.findStudentByEmail(newStudent.getEmail()).isPresent()) {
                throw new IllegalStateException("Sellise emailiga õpilane on juba olemas");
            }
            existingStudent.setEmail(newStudent.getEmail());
        }
        if(newStudent.getDateOfBirth() != null) {
            existingStudent.setDateOfBirth(newStudent.getDateOfBirth());
        }
        studentRepository.save(existingStudent);
        System.out.println("Student uuendatud: " + existingStudent);



    }

    public List<String> getStudentSubjects(Long studentId) {
        List<String> names = new ArrayList<>();
        List<Subject> subjects = subjectRepository.findAll();
        Student student = studentRepository.findById(studentId).orElseThrow();
        for(Subject s : subjects) {
            if(s.getStudents().contains(student)) {
                names.add(s.getName());
            }
        }
        return names;

    }

}
