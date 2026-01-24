package com.sachin.ood.parkinglot.dtos;

import com.sachin.ood.parkinglot.models.ParkingLot;

public class UpdateParkingLotAddressResponseDto extends ResponseDto {
    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    private ParkingLot parkingLot;

}
