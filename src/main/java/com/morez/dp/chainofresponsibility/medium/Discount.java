package com.morez.dp.chainofresponsibility.medium;

public class Discount extends DiscountHandler {

    @Override
    public double applyDiscount(Bill bill) {
       return successor.applyDiscount(bill);
    }
}
