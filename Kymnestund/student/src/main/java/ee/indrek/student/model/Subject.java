package ee.indrek.student.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor //Konstruktoreid ei ole vaja, kui kasutada settereid
@AllArgsConstructor //Sellepärast, et tühi konstruktor alati eksisteerib automaatselt
@ToString
@Entity
public class Subject {

    @Id
    private String name;
    @ManyToMany
    @ToString.Exclude   //mitmel õpilasel võib olla mitu õppeainet,
                        //mitmel õppeainel võib olla mitu õpilast
    private List<Student> students;

    @ManyToOne //ühel õpetajal võib olla mitu õppeainet, ühel õppeainel ainult üks õpetaja
    private Teacher teacher;

    public void addStudent(Student student) {
        students.add(student);
    }
}
