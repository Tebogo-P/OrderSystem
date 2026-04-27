package za.ac.cput.orderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.orderingsystem.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
