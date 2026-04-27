package za.ac.cput.orderingsystem.factory;

import za.ac.cput.orderingsystem.domain.Product;

import java.util.UUID;

public class ProductFactory {

    public static Product getProduct(String productId, String productName, double productPrice, int stockQuantity) {
        if(productId == null || productId.isEmpty() || productName == null){
            throw new IllegalArgumentException("productName or productId is null or empty");
        }
        if(stockQuantity <= 0 || productPrice <= 0.0){
            throw new IllegalArgumentException("stockQuantity or productPrice is null or empty");
        }

        String generatedProductId = "PROD-" + UUID.randomUUID().toString();

        Product product = new Product();
        product.setProductId(generatedProductId);
        product.setProductName(productName);
        product.setPrice(productPrice);
        product.setStockQuantity(stockQuantity);
        return product;
    }
}
