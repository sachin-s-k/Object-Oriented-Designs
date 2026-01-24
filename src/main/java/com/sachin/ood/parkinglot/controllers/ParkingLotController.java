package com.sachin.ood.parkinglot.controllers;

import com.sachin.ood.parkinglot.dtos.*;
import com.sachin.ood.parkinglot.models.Floor;
import com.sachin.ood.parkinglot.models.ParkingLot;
import com.sachin.ood.parkinglot.services.ParkingLotService;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotController {

    private ParkingLotService parkingLotService;
    public ParkingLotController(ParkingLotService parkingLotService){
        this.parkingLotService=parkingLotService;

    }


    public CreateParkingLotResponse createParkingLot(CreateParkingLotRequestDto request) {
        ParkingLot parkingLot= new ParkingLot();
        parkingLot.setAddress( request.getAddress());
        List<Floor> parkingFloors= new ArrayList<>();
        for(int i=1;i<=request.getNumberOfFloors();i++){
            parkingFloors.add(new Floor());
        }
        parkingLot.setFloors(parkingFloors);
        ParkingLot  createdParkingLot= parkingLotService.createParkingLot(parkingLot);
       CreateParkingLotResponse response = new CreateParkingLotResponse();
        response.setParkingLot(createdParkingLot);
        response.setResponseStatusDto(ResponseStatusDto.SUCCESS);

        return  response;

    };

    public UpdateParkingLotAddressResponseDto updateParkingLotAddress(UpdateParkingLotRequestDto request){

        ParkingLot  updatedParkingLot= parkingLotService.updateAddress(request.getId(),request.getAddress());
        UpdateParkingLotAddressResponseDto updateParkingLotAddressResponseDto= new UpdateParkingLotAddressResponseDto();
           updateParkingLotAddressResponseDto.setParkingLot(updatedParkingLot);
        updateParkingLotAddressResponseDto.
        return  updateParkingLotAddressResponseDto;
    }

}
// DTO --> Data Transfer Object, for every request from the client, for every response to the client--> we create DTO