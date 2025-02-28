package ee.indrek.student.controller;

import ee.indrek.student.model.Student;
import ee.indrek.student.model.dto.StudentDto;
import ee.indrek.student.repository.StudentRepository;
import ee.indrek.student.service.StudentService;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="api/v1/student") //localhost:8080/api/v1/student
@CrossOrigin("http://localhost:4200")
@Log4j2
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("dto") //localhost:8080/api/v1/student/dto
    public List<StudentDto> getStudentsDto() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos = new ArrayList<>();
//        ModelMapper modelMapper = new ModelMapper();

        for(Student s: students) {
            StudentDto studentDto = modelMapper.map(s, StudentDto.class);
            studentDtos.add(studentDto);

//            StudentDto studentDto = new StudentDto();
//            studentDto.setName(s.getName());
//            studentDto.setEmail(s.getEmail());
//            studentDtos.add(studentDto);
        }
        return studentDtos;
    }
    @GetMapping("dto2") //localhost:8080/api/v1/student/dto2
    public List<StudentDto> getStudentsDto2() {
//        ModelMapper modelMapper = new ModelMapper();
//        System.out.println("Hakkasin võtma studenteid");
//        System.out.println(modelMapper);
        log.info("Hakkasin võtma studenteid");
        log.error(modelMapper);
        List<StudentDto> studentDtos = studentRepository.findAll().stream()
                .map(s -> modelMapper.map(s, StudentDto.class))
                .toList();
        return studentDtos;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@Valid @RequestBody Student student) {
        studentService.registerNewStudent(student);
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable Long studentId, @RequestBody Student newStudent) {
        studentService.updateStudent(studentId, newStudent);
    }

    @GetMapping("student-subjects")
    public List<String> getStudentSubjects(@RequestParam Long studentId) {
        return studentService.getStudentSubjects(studentId);
    }



    @GetMapping("{name}/{email}/{dob}")
    public List<Student> addStudent(@PathVariable String name, @PathVariable String email,
                                    @PathVariable LocalDate dob) {
        studentService.addStudent(new Student(name,email,dob));
        return studentService.getStudents();
    }

    @GetMapping("add")
    public String addNewStudent(@RequestParam String name, @RequestParam String email, @RequestParam LocalDate dob) {
        studentService.addStudent(new Student(name, email, dob));
        return "Student lisatud";
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) //meetod peaks käivituma, kui tuleb see error
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>();
//        errors.put("test", "test");
        exception.getBindingResult().getAllErrors()
                .forEach(err -> {
                    String fieldName = ((FieldError) err).getField();
                    String errorMessage = err.getDefaultMessage();
                    errors.put(fieldName,errorMessage);
                });

//        List<ObjectError> caughtErrors = exception.getBindingResult().getAllErrors();
//        for (ObjectError err : caughtErrors) {
//            String fieldName = ((FieldError) err).getField();
//            String errorMessage = err.getDefaultMessage();
//            errors.put(fieldName,errorMessage);
//        }
//

        return errors;
    }

}
