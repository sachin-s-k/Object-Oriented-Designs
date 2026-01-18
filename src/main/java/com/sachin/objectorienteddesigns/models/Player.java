package com.sachin.objectorienteddesigns.models;

public abstract class Player {
    Symbol symbol;
    PlayerType playerType;
    String name;


    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
    Player(Symbol symbol,PlayerType playerType){
        this.symbol=symbol;
        this.playerType=playerType;

    }

    public abstract  Move makeMove(Board board);




}
