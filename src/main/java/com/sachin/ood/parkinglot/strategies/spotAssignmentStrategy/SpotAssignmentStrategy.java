package com.sachin.ood.parkinglot.strategies.spotAssignmentStrategy;

import com.sachin.ood.parkinglot.models.*;

public interface SpotAssignmentStrategy {
    Spot assignSpot(ParkingLot parkingLot, SpotType spotType);
}
