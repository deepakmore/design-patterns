package com.morez.dp.chainofresponsibility.medium;

public abstract class DiscountHandler {

    protected DiscountHandler successor;

    public void setSuccessor(DiscountHandler successor) {
        this.successor = successor;
    }

    public abstract double applyDiscount(Bill bill);
}
