package com.morez.dp.chainofresponsibility.medium;

public class AweOffersDiscountHandler extends DiscountHandler {

    @Override
    public double applyDiscount(Bill bill) {
        bill.setDiscount(bill.getDiscount() + bill.getTotalAmount() * 0.05);
        return bill.getTotalAmount() > 500.0 && bill.getTotalAmount() <= 1000.0 ?
                bill.getDiscount() : successor.applyDiscount(bill);
    }
}
