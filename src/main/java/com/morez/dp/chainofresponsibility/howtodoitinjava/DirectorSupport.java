package com.morez.dp.chainofresponsibility.howtodoitinjava;

import lombok.Data;

@Data
public class DirectorSupport implements ISupportService {

    ISupportService handler = null;

    @Override
    public void handleRequest(ServiceRequest request) {
        if(request.getType() == ServiceLevel.LEVEL_FOUR) {
            request.setConclusion("Director Support Team has resolved level 4 issue");
        } else if(handler != null) {
            handler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("No Handler Found -" + request.getType());
        }
    }
}
