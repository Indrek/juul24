package ee.indrek.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class KontaktAndmed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eesNimi;
    private String pereNimi;
    private String telefon;
    private String aadress;
    private String email;

    public KontaktAndmed(String eesNimi, String pereNimi, String telefon, String aadress, String email) {
        this.eesNimi = eesNimi;
        this.pereNimi = pereNimi;
        this.telefon = telefon;
        this.aadress = aadress;
        this.email = email;
    }
}
