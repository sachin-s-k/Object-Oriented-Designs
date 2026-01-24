package com.sachin.ood.parkinglot.strategies.spotAssignmentStrategy;

import com.sachin.ood.parkinglot.models.*;

public class RandomSpotAssignmentStrategy implements  SpotAssignmentStrategy{



    @Override
    public Spot assignSpot(ParkingLot parkingLot, SpotType spotType) {

        for(Floor floor:parkingLot.getFloors()){
            for(Spot spot:floor.getSpots()){
                if(spot.getParkingSpotStatus().equals(SpotStatus.AVAILABLE)&&spot.getSpotType().equals(spotType)){
                    return spot;
                }
            }
        }
        return null;

    }
}
