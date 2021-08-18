package com.payment.system.entities;

public class Item {

    private String uniqueCode;
    private double price;

    public Item(String productCode, double cost){
        this.uniqueCode=productCode;
        this.price=cost;
    }

    public String getuniqueCode() {
        return uniqueCode;
    }

    public double getPrice() {
        return price;
    }

}
