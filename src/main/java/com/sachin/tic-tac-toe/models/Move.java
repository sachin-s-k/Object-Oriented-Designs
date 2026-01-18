package com.sachin.objectorienteddesigns.models;

public class Move {

    public com.sachin.objectorienteddesigns.models.Symbol getSymbol() {
        return symbol;
    }

    private com.sachin.objectorienteddesigns.models.Symbol symbol;
    private com.sachin.objectorienteddesigns.models.Player player;



    private com.sachin.objectorienteddesigns.models.Cell cell;



    public com.sachin.objectorienteddesigns.models.Player getPlayer() {
        return player;
    }



    public com.sachin.objectorienteddesigns.models.Cell getCell() {
        return cell;
    }
    public void setPlayer(com.sachin.objectorienteddesigns.models.Player player) {
        this.player = player;
    }



    public void setSymbol(com.sachin.objectorienteddesigns.models.Symbol symbol) {
        this.symbol = symbol;
    }
    public void setCell(com.sachin.objectorienteddesigns.models.Cell cell) {
        this.cell = cell;
    }




}
