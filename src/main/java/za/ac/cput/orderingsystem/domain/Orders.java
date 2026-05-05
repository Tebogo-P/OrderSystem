package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)

public abstract class Orders{
    @Id
    private String orderId;

    private Date date;

    private String status;

    private String orderItemId;
}


