package za.ac.cput.orderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.orderingsystem.domain.OnlineOrders;

public interface OnlineOrdersRepository extends JpaRepository<OnlineOrders, String> {
}
