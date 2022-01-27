package com.morez.dp.chainofresponsibility.howtodoitinjava;

import lombok.Data;

@Data
public class FrontDeskSupport implements ISupportService{

    private ISupportService handler = null;

    @Override
    public void handleRequest(ServiceRequest request) {
        if(request.getType() == ServiceLevel.LEVEL_ONE) {
            request.setConclusion("Front Desk Team resolved level 1 issue");
        } else if(handler != null) {
            handler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("No Handler Found " + request.getType());
        }
    }
}
