package com.morez.dp.chainofresponsibility.howtodoitinjava;

import lombok.Data;

@Data
public class ServiceRequest {
    private ServiceLevel type;
    private String conclusion = null;
}
