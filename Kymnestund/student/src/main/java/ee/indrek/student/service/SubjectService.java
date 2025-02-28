package ee.indrek.student.service;

import ee.indrek.student.model.Student;
import ee.indrek.student.model.Subject;
import ee.indrek.student.model.Teacher;
import ee.indrek.student.repository.StudentRepository;
import ee.indrek.student.repository.SubjectRepository;
import ee.indrek.student.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    public String addSubject(String subjectName) {
        Subject subject = new Subject();
        subject.setName(subjectName);
        subjectRepository.save(subject);
        return "Õppeaine " + subjectName + " edukalt lisatud";

    }

    public String deleteSubject(String subjectName) {
        subjectRepository.deleteById(subjectName);
        return "Õppeaine " + subjectName + " edukalt kustutatud";
    }

    public String addStudentToSubject(String subjectName, Long studentId) {
        Subject subject = subjectRepository.findById(subjectName).orElseThrow(); //käitub samamoodi nagu .get()
        Student student = studentRepository.findById(studentId).orElseThrow();

        subject.addStudent(student);
        subjectRepository.save(subject);
        return "Õppeainele " + subjectName + " lisati õpilane " + student.getName();


    }

    public String removeStudentFromSubject(String subjectName, List<Long> studentIds) {
        Subject subject = subjectRepository.findById(subjectName).orElseThrow();
        List<Student> students = studentRepository.findAllById(studentIds);
        List<String> studentNames = new ArrayList<>();
        for(Student s : students) {
            studentNames.add(s.getName());
            subject.getStudents().remove(s);
        }
        subjectRepository.save(subject);

        return studentNames + " eemaldatud õppeainest " + subjectName;

    }

    public String addTeacherToSubject(String subjectName, Long teacherId) {
        Subject subject = subjectRepository.findById(subjectName).orElseThrow(); //käitub samamoodi nagu .get()
        Teacher teacher = teacherRepository.findById(teacherId).orElseThrow();

        subject.setTeacher(teacher);
        subjectRepository.save(subject);
        return "Õppeainele " + subjectName + " lisati õpetaja " + teacher.getKontaktAndmed().getEesNimi() + teacher.getKontaktAndmed().getPereNimi();
    }
}
