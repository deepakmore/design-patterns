package com.morez.dp.chainofresponsibility.medium;

public class GoldenDiscountHandler extends DiscountHandler {

    @Override
    public double applyDiscount(Bill bill) {
        bill.setDiscount(bill.getTotalAmount() * 0.05);
        return bill.getTotalAmount() <= 500 ? bill.getDiscount() : successor.applyDiscount(bill);
    }
}
