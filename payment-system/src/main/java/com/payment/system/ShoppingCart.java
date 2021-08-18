package com.payment.system;


import java.util.ArrayList;
import java.util.List;

import com.payment.system.entities.Item;

public class ShoppingCart {

    List<Item> items;

	public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    private double calculateTotal(){
        double sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public double pay(Payment paymentMethod){
        double amount = calculateTotal();
        return paymentMethod.pay(amount);
    }
}