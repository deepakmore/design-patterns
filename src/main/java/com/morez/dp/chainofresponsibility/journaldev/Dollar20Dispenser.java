package com.morez.dp.chainofresponsibility.journaldev;

public class Dollar20Dispenser implements DispenseChain {
    DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispense " + num + " of 20 $");
            if(remainder != 0) chain.dispense(new Currency(remainder));
        } else {
            chain.dispense(cur);
        }
    }
}
