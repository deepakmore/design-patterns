package com.morez.dp.chainofresponsibility.howtodoitinjava;

import lombok.Data;

@Data
public class SupervisorSupport implements ISupportService{

    public ISupportService handler = null;

    @Override
    public void handleRequest(ServiceRequest request) {
        if(request.getType() == ServiceLevel.LEVEL_TWO) {
            request.setConclusion("Supervisor Support Team resolved level 2 issue");
        } else if(handler != null) {
            handler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("No Handler Found " + request.getType());
        }
    }
}
