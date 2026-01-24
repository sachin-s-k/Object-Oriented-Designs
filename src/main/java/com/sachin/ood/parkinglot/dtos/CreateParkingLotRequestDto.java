package com.sachin.ood.parkinglot.dtos;

public class CreateParkingLotRequestDto {

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String getAddress() {
        return address;
    }

    String address;

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    int numberOfFloors;

}
