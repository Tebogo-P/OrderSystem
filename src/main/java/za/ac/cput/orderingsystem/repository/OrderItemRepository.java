package za.ac.cput.orderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.orderingsystem.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
}
