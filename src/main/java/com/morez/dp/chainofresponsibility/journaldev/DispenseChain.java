package com.morez.dp.chainofresponsibility.journaldev;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}
