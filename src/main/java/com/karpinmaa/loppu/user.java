package com.karpinmaa.loppu;

public class user {
    private ShoppingCart ShoppingCart = new ShoppingCart();
    private String name;
    private int phone;
  

    public user(int phone, String name, boolean discount) {
        this.phone = phone;
        this.name = name;
        ShoppingCart.setDiscount(discount); 
    }

    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ShoppingCart getShoppingCart() {
        return this.ShoppingCart;
    }
    

}
