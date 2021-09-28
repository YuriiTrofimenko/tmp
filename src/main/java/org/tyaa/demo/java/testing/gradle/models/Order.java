package org.tyaa.demo.java.testing.gradle.models;

public class Order {

    public String productName;
    public Double price;
    public Integer quantity;

    public Order(String productName, Double price, Integer quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
            "productName='" + productName + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            '}';
    }
}
