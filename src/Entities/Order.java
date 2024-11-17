package Entities;

import java.util.ArrayList;
import java.util.List;

// Order: Stores order details including items and total amount.
public class Order {
    private static int idCounter = 1;
    private int orderId;
    private List<Product> items = new ArrayList<>();
    private double totalAmount;

    public Order(List<Product> items) {
        this.orderId = idCounter++;
        this.items = items;
        this.totalAmount = items.stream().mapToDouble(Product::getPrice).sum();
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", items=" + items + ", totalAmount=" + totalAmount + "}";
    }
}
