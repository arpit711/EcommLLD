package services;

import Entities.Cart;
import Entities.Product;

import java.util.List;

public class CartService {
    private Cart cart = new Cart();

    public void addItem(Product product) {
        cart.addProduct(product);
    }

    public List<Product> getCartItems() {
        return cart.getProductList();
    }

}
