package com.karpinmaa.loppu;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> Products = new ArrayList<>();

    private boolean discount;
    public List<Product> getProducts() {
        return this.Products;
    }
    public double getTotalPrice() {
    double totalPrice = 0;
    for (Product product : Products) {
        totalPrice += product.getPrice();
    }
    if (discount) {
        totalPrice *= 0.9;
    }
    return totalPrice;

    
}
public void setDiscount(boolean discount) {
    this.discount = discount;
}
}
