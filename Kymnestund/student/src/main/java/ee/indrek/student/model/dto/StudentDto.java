package ee.indrek.student.model.dto;


import lombok.Data;

@Data //@Getter, @Setter, üks konstruktoritest
public class StudentDto { //DTO - Data Transfer Object
    private String name; //DTOs võiksid väljade nimed kattuda põhiklassi väljadega
    private String email;

}
