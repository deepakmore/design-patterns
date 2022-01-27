package com.morez.dp.chainofresponsibility.gfg;

import com.morez.dp.chainofresponsibility.medium.Bill;
import org.junit.Test;

public class ChainTest {
    @Test
    public void shouldGetAppropriateResult() {
        Chain chain = new Chain();

        //Calling chain of responsibility
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}