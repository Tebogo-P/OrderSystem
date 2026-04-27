package za.ac.cput.orderingsystem.factory;

import za.ac.cput.orderingsystem.domain.OrderItem;

import java.util.UUID;

public class OrderItemFactory {

    public static OrderItem createOrderItem(String orderItemId, int quantity, double subTotal) {
        if(orderItemId == null){
            throw new IllegalArgumentException("orderItemId is null");
        }
        if(quantity <= 0 || subTotal <= 0){
            throw new IllegalArgumentException("quantity or subTotal is negative");
        }

        String generatedOrderItemId = "ITM-" + UUID.randomUUID().toString();

        OrderItem orderItem = new OrderItem();
        orderItem.setOrderItemId(generatedOrderItemId);
        orderItem.setQuantity(quantity);
        orderItem.setSubTotal(subTotal);

        return orderItem;
    }
}
