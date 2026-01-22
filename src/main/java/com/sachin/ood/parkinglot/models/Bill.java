package com.sachin.ood.parkinglot.models;

import java.util.Date;

public class Bill extends  BaseModel{
    private Date exitTime;
    private Ticket ticket;
    private  Vechicle vechicle;
    private Operator operator;
    private float amount;
   private  BillPaidStatus billPaidStatus;



}
