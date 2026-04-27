package za.ac.cput.orderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.orderingsystem.domain.InStoreOrders;

public interface InStoreOrdersRepository extends JpaRepository<InStoreOrders, String> {
}
