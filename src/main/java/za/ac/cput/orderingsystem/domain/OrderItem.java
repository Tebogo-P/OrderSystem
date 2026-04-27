package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class OrderItem{
    @Id
    private String orderItemId;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double subTotal;
}
