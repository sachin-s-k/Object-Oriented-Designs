package com.sachin.ood.parkinglot.models;

public class Payment extends BaseModel {
    private Bill bill;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private String referenceId;

}
