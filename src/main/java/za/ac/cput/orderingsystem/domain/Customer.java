package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Customer {

    @Id
    @Column(name = "Patient_id")
    private String patientId;

    @Embedded
    private Name Name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String mobileNumber;

    @Column(name = "order_id")
    private String orderId;
}
