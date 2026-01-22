package com.sachin.ood.parkinglot.models;

import com.sachin.ood.tictactoe.models.GameStatus;

public abstract class Gate extends  BaseModel {
    int gateNumber;
   GateType gateType;
   GameStatus gateStatus;
   Operator operator;
}
