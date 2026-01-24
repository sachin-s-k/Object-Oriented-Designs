package com.sachin.ood.parkinglot.controllers;

import com.sachin.ood.parkinglot.dtos.GenerateTicketRequestDto;
import com.sachin.ood.parkinglot.dtos.GenerateTicketResponseDto;
import com.sachin.ood.parkinglot.models.Ticket;
import com.sachin.ood.parkinglot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

public TicketController(TicketService ticketService){
    this.ticketService=ticketService;
}

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto request){



    };
}
