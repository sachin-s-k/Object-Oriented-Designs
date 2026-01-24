package com.sachin.ood.parkinglot.dtos;

import com.sachin.ood.parkinglot.models.EntryGate;
import com.sachin.ood.parkinglot.models.Vechicle;

public class GenerateTicketRequestDto {

    private EntryGate entryGate;
    private Vechicle vechicle;

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public Vechicle getVechicle() {
        return vechicle;
    }
}
