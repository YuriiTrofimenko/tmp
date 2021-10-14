package org.tyaa.demo.java.testing.gradle.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(productName, order.productName) &&
            Objects.equals(price, order.price) &&
            Objects.equals(quantity, order.quantity);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (productName == null ? 0 : productName.hashCode());
        hash = 31 * hash + (price == null ? 0 : price.hashCode());
        hash = 31 * hash + (quantity == null ? 0 : quantity.hashCode());
        return hash;
    }
}
