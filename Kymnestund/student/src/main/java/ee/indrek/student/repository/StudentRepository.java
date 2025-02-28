package ee.indrek.student.repository;

import ee.indrek.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //query meetodid
    Optional<Student> findStudentByEmail(String email);
}
