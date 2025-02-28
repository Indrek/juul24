package ee.indrek.student.repository;

import ee.indrek.student.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, String> {
    List<String> findByStudentsId(Long studentId);



    //Siit saame kätte AINULT Subject või List<Subject>

}
