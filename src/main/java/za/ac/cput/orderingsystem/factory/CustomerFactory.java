package za.ac.cput.orderingsystem.factory;

import za.ac.cput.orderingsystem.domain.Customer;
import za.ac.cput.orderingsystem.domain.Name;

import java.util.UUID;

public class CustomerFactory {

    public static Customer createCustomer(String email, String mobileNumber, Name name, String orderId) {

        if (email == null || mobileNumber == null || name == null || orderId == null) {
            return null;
        }
        String generatedPatientId = "CUST-" + UUID.randomUUID().toString();

        Customer customer = new Customer();
        customer.setPatientId(generatedPatientId);
        customer.setEmail(email);
        customer.setMobileNumber(mobileNumber);
        customer.setName(name);
        customer.setOrderId(orderId);

        return customer;
    }
}
