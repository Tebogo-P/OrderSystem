package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
@DiscriminatorColumn

public class InStoreOrders extends Orders {
    private double immediatePayment;

    private String cashierName;

}
