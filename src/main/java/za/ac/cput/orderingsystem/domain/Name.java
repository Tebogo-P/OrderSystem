package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
//No PK
//Relies on the Customer Entity
public class Name{
    private String firstName;
    private String middleName;
    private String lastName;
}
