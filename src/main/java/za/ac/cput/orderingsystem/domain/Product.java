package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Product {
    @Id
    private String productId;

    @Column()
    private String productName;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int stockQuantity;

}
