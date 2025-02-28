package ee.spring.naidis;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //lombok teeb igale väljale getteri
@Setter //--^-- setteri
@NoArgsConstructor //--^-- tühja konstruktori
@AllArgsConstructor // --^-- kõikide väljadega konstruktori
@Entity //ütleb, et see on midagi, mis peaks minema andmebaasi
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String make;
    private String model;
    private int year;
    //private String test;


    //Kuna ID genereeritakse, siis teeme konstruktori ilma selleta
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
