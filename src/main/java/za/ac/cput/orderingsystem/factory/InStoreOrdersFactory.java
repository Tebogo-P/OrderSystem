package za.ac.cput.orderingsystem.factory;

import za.ac.cput.orderingsystem.domain.InStoreOrders;

import java.util.Date;
import java.util.UUID;

public class InStoreOrdersFactory {

    public static InStoreOrders createInStoreOrders(double immediatePayment, String cashierName, String status, String orderItemId) {
        if(immediatePayment <= 0.0){
            throw new IllegalArgumentException("immediatePayment must be greater than or equal to 0.0");
        }
        if(cashierName == null || cashierName.isEmpty()){
            throw new IllegalArgumentException("cashierName must not be empty");
        }

        if(orderItemId == null || orderItemId.isEmpty() || status == null || status.isEmpty()) {
            throw new IllegalArgumentException("orderId and status must not be empty");
        }

        String generatedOrderId = "IO-" + UUID.randomUUID().toString();
        Date orderDate = new Date();

        InStoreOrders inStoreOrders = new InStoreOrders();
        inStoreOrders.setImmediatePayment(immediatePayment);
        inStoreOrders.setCashierName(cashierName);

        inStoreOrders.setOrderId(generatedOrderId);
        inStoreOrders.setDate(orderDate);
        inStoreOrders.setStatus(status);
        inStoreOrders.setOrderItemId(orderItemId);
        return inStoreOrders;

    }

}
