package com.sachin.ood.parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private Spot spot;
    private Operator operator;
    private Vechicle vechicle;
    private EntryGate entryGate;
    private ParkingLot parkingLot;
    private String name;

}
