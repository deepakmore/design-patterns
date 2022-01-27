package com.morez.dp.chainofresponsibility.howtodoitinjava;

import lombok.Data;

import java.util.function.Function;

@Data
public class SupportService implements ISupportService {


    private ISupportService handler = null;

    @Override
    public void handleRequest(ServiceRequest request) {
        handler.handleRequest(request);
    }


}
