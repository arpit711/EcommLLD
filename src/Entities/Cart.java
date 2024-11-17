package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Cart {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

}
