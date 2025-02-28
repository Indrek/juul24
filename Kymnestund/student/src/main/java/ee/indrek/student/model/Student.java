package ee.indrek.student.model;

import ee.indrek.student.conf.AppConfig;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {

    @Transient
    public final String REGEX_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Nimi ei tohi olla tühi") //NotNull ja NotBlank
    @Size(min=2, max=200, message = "Nimi peab olema vähemalt 2 tähemärki")
    private String name;
    @NotEmpty(message = "Email ei tohi olla tühi")
    @Email(message = "Email pole korrektne", regexp = REGEX_PATTERN)
    private String email;
    @NotNull(message = "Sünnikuupäev ei tohi olla tühi")
    @Past(message = "Vale kuupäev")
    private LocalDate dateOfBirth; //dob
    @Transient //ütleb, et ära seda andmebaasi tabelina tee
    private Integer age;


    public Student(String name, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
//        this.age = age;
    }

    public Integer getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}
