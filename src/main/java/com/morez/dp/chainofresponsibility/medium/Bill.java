package com.morez.dp.chainofresponsibility.medium;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bill {

    public int billNumber;
    private double totalAmount;
    private double discount;

    public Bill(int billNumber, double totalAmount) {
        this.billNumber= billNumber;
        this.totalAmount = totalAmount;
    }

    protected void setDiscount(double discount) {
        this.discount = discount;
    }
}
