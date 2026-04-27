package za.ac.cput.orderingsystem.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass

public abstract class Orders{
    @Id
    private String orderId;

    private Date date;

    private String status;

    private String orderItemId;
}


