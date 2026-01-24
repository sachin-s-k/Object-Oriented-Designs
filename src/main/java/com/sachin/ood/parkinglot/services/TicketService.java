package com.sachin.ood.parkinglot.services;

import com.sachin.ood.parkinglot.models.EntryGate;
import com.sachin.ood.parkinglot.models.Ticket;
import com.sachin.ood.parkinglot.models.Vechicle;
import com.sachin.ood.parkinglot.repositories.TicketRepository;
import com.sachin.ood.parkinglot.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;

public class TicketService {
    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    public  TicketService(TicketRepository ticketRepository,SpotAssignmentStrategy spotAssignmentStrategy){
        this.spotAssignmentStrategy=spotAssignmentStrategy;
       this.ticketRepository= ticketRepository;
    }


    public Ticket generateTicket(Vechicle vechicle, EntryGate entryGate){


    }

}
