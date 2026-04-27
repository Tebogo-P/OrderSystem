package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)

public class OnlineOrders extends Orders {

    private String deliveryAddress;

    private String shippingCode;

    private Double digitalPayment;

}
