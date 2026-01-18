package com.sachin.objectorienteddesigns.models;

public abstract class Player {
    com.sachin.objectorienteddesigns.models.Symbol symbol;
    com.sachin.objectorienteddesigns.models.PlayerType playerType;
    String name;


    public com.sachin.objectorienteddesigns.models.Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(com.sachin.objectorienteddesigns.models.Symbol symbol) {
        this.symbol = symbol;
    }

    public com.sachin.objectorienteddesigns.models.PlayerType getPlayerType() {
        return playerType;
    }
    public void setPlayerType(com.sachin.objectorienteddesigns.models.PlayerType playerType) {
        this.playerType = playerType;
    }
    Player(com.sachin.objectorienteddesigns.models.Symbol symbol, com.sachin.objectorienteddesigns.models.PlayerType playerType){
        this.symbol=symbol;
        this.playerType=playerType;

    }

    public abstract com.sachin.objectorienteddesigns.models.Move makeMove(com.sachin.objectorienteddesigns.models.Board board);




}
