package ee.indrek.student.controller;

import ee.indrek.student.model.Student;
import ee.indrek.student.model.Subject;
import ee.indrek.student.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/subject") //localhost:8080/api/v1/subject
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("get-all") //localhost:8080/api/v1/subject/get-all
    public ResponseEntity<List<Subject>> getSubjects() {
        return ResponseEntity.ok(subjectService.getSubjects());
    }
    @PostMapping("add")
    public ResponseEntity<String> addSubject(@RequestParam String subjectName) {
        return ResponseEntity.ok(subjectService.addSubject(subjectName));
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteStudent(@RequestParam String subjectName) {
        return ResponseEntity.ok(subjectService.deleteSubject(subjectName));
    }
    @PostMapping("add-student")
    public String addStudentToSubject(@RequestParam String subjectName, @RequestParam Long studentId) {
        return subjectService.addStudentToSubject(subjectName,studentId);
    }
    @DeleteMapping("remove-students")
    public String removeStudentFromSubject(@RequestParam String subjectName, @RequestParam List<Long> studentIds) {
        return subjectService.removeStudentFromSubject(subjectName,studentIds);
    }
    @PostMapping("add-teacher")
    public String addTeacherToSubject(@RequestParam String subjectName, @RequestParam Long teacherId) {
        return subjectService.addTeacherToSubject(subjectName,teacherId);
    }

}
