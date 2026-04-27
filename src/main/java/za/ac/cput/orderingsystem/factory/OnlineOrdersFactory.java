package za.ac.cput.orderingsystem.factory;

import za.ac.cput.orderingsystem.domain.OnlineOrders;

import java.util.Date;
import java.util.UUID;

public class OnlineOrdersFactory {

    public static OnlineOrders createOnlineOrders(String deliveryAddress, String shippingCode, double digitalPayment, String status, String orderItemId) {
        if(deliveryAddress == null || shippingCode == null){
            return null;
        }
        if(digitalPayment <= 0.0){
            throw new IllegalArgumentException("digitalPayment must be greater than or equal to 0.0");
        }

        if(status == null || orderItemId == null || orderItemId.isEmpty() || status.isEmpty()){
            throw new IllegalArgumentException("status or orderItemId or orderItemId is null or empty");
        }

        String generatedOrderId ="oo-" + UUID.randomUUID().toString();
        Date orderDate = new Date();

        OnlineOrders onlineOrders = new OnlineOrders();
        onlineOrders.setDeliveryAddress(deliveryAddress);
        onlineOrders.setShippingCode(shippingCode);
        onlineOrders.setDigitalPayment(digitalPayment);

        onlineOrders.setOrderId(generatedOrderId);
        onlineOrders.setDate(orderDate);
        onlineOrders.setStatus(status);
        onlineOrders.setOrderItemId(orderItemId);
        return onlineOrders;
    }


}
