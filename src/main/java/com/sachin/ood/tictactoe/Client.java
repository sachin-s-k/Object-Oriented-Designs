package com.sachin.ood.tictactoe;

import com.sachin.ood.parkinglot.controllers.ParkingLotController;
import com.sachin.ood.parkinglot.controllers.TicketController;
import com.sachin.ood.parkinglot.dtos.CreateParkingLotRequestDto;
import com.sachin.ood.parkinglot.dtos.CreateParkingLotResponse;
import com.sachin.ood.parkinglot.dtos.ResponseStatusDto;
import com.sachin.ood.parkinglot.repositories.ParkingLotRepository;
import com.sachin.ood.parkinglot.repositories.TicketRepository;
import com.sachin.ood.parkinglot.services.ParkingLotService;
import com.sachin.ood.parkinglot.services.TicketService;
import com.sachin.ood.parkinglot.strategies.ObjectRegistry;
import com.sachin.ood.parkinglot.strategies.spotAssignmentStrategy.RandomSpotAssignmentStrategy;
import com.sachin.ood.parkinglot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Client {
    public static void main(String[] args) {
        ObjectRegistry.put("parkingLotRepository", new ParkingLotRepository());
        ObjectRegistry.put("parkingLotService",new ParkingLotService((ParkingLotRepository) ObjectRegistry.get("parkingLotRepository")));
        ObjectRegistry.put("parkingLotController", new ParkingLotController((ParkingLotService) ObjectRegistry.get("parkingLotService")));
        ObjectRegistry.put("randomSpotAssignmentStrategy",new RandomSpotAssignmentStrategy());
        ObjectRegistry.put("ticketRepository", new TicketRepository());
        ObjectRegistry.put("ticketService", new TicketService((TicketRepository) ObjectRegistry.get("ticketRepository"),(SpotAssignmentStrategy) ObjectRegistry.get("randomSpotAssignmentStrategy")));
        ObjectRegistry.put("ticketController",new TicketController((TicketService) ObjectRegistry.get("ticketService")));
        ParkingLotController parkingLotController =(ParkingLotController) ObjectRegistry.get("parkingLotController");
        CreateParkingLotRequestDto request=new CreateParkingLotRequestDto();
        request.setAddress("Sachin's house");
        request.setNumberOfFloors(4);
       CreateParkingLotResponse response= parkingLotController.createParkingLot(request);

        System.out.println(response.getParkingLot());
    }
}
