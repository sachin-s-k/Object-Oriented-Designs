package com.sachin.ood.parkinglot.dtos;

import com.sachin.ood.parkinglot.models.ParkingLot;

public class CreateParkingLotResponse {
    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    private ParkingLot parkingLot;

    public ResponseStatusDto getResponseStatusDto() {
        return responseStatusDto;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setResponseStatusDto(ResponseStatusDto responseStatusDto) {
        this.responseStatusDto = responseStatusDto;
    }

    ResponseStatusDto responseStatusDto;
}
