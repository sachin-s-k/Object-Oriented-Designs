package com.sachin.ood.parkinglot.services;

import com.sachin.ood.parkinglot.models.ParkingLot;
import com.sachin.ood.parkinglot.repositories.ParkingLotRepository;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    public ParkingLotService(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository=parkingLotRepository;
    }
    public ParkingLot createParkingLot(ParkingLot parkingLot){

return parkingLotRepository.save(parkingLot);
    }

    public ParkingLot updateAddress(Long id , String name){
        ParkingLot currentParkingLot= parkingLotRepository.getById(id);
        currentParkingLot.setAddress(name);
        return parkingLotRepository.updateAddress(currentParkingLot);


    }
}
