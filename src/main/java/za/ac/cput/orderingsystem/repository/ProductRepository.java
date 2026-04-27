package za.ac.cput.orderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.orderingsystem.domain.Product;

public interface ProductRepository extends JpaRepository<Product,String> {
}
