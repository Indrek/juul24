package ee.indrek.student.controller;

import ee.indrek.student.model.KontaktAndmed;
import ee.indrek.student.model.Teacher;
import ee.indrek.student.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/teacher") //localhost:8080/api/v1/teacher
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @PostMapping("add")
    public void addTeacher(@RequestParam String eesNimi, @RequestParam String pereNimi, @RequestParam String tel,
                           @RequestParam String aad, @RequestParam String email) {
        Teacher teacher = new Teacher();
        KontaktAndmed kontaktAndmed = new KontaktAndmed(eesNimi,pereNimi,tel,aad,email);
        teacher.setKontaktAndmed(kontaktAndmed);
        teacherRepository.save(teacher);
    }
    @GetMapping("get-all") //localhost:8080/api/v1/teacher/get-all?page=0&size=1
    public Page<Teacher> getAllTeachers(Pageable pageable) {
        return teacherRepository.findAll(pageable);
    }

//    private String eesNimi;
//    private String pereNimi;
//    private String telefon;
//    private String aadress;
//    private String email;

}
