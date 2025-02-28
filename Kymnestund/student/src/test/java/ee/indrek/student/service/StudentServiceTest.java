package ee.indrek.student.service;

import ee.indrek.student.model.Student;
import ee.indrek.student.repository.StudentRepository;
import ee.indrek.student.repository.SubjectRepository;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    //mis servicet me tahame testida
    @InjectMocks
    private StudentService studentService;

    //deklareerime dependencied
    @Mock
    private StudentRepository studentRepository;
    @Mock
    private SubjectRepository subjectRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    //klass mida testid + meetod mida testid + mis tahan et oleks tulemus
//    public void studentService_registerNewStudent_emailNotExists()
    @Test
    public void shouldRegisterNewStudent_whenEmailNotExists() {
        //Given (Arrange)
        Student student = new Student("Testmees", "testmees@mail.ee", LocalDate.parse("2020-02-02"));

        //When (Act)
        when(studentRepository.findStudentByEmail(student.getEmail())).thenReturn(Optional.empty());
        studentService.registerNewStudent(student);

        //Then (Assert)
        ArgumentCaptor<Student> studentArgumentCaptor = ArgumentCaptor.forClass(Student.class);
        verify(studentRepository).save(studentArgumentCaptor.capture());
        Student capturedStudent = studentArgumentCaptor.getValue();
        assertEquals(student, capturedStudent);

    }

    @Test
    public void shouldThrowException_whenEmailExists() {
        //Given (Arrange)
        Student student = new Student("Testmees", "testmees@mail.ee", LocalDate.parse("2020-02-02"));

        //When (Act)
        when(studentRepository.findStudentByEmail(student.getEmail())).thenReturn(Optional.of(student));

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            studentService.registerNewStudent(student);
        });
        //Then (Assert)
        assertEquals("Email olemas, ei saa lisada", exception.getMessage());
        verify(studentRepository, never()).save(any());
    }

}