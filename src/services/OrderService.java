package services;

import Entities.Order;
import Entities.Product;

import java.util.List;

public class OrderService {
    public Order placeOrder(List<Product> items) {
        return new Order(items);
    }


}
