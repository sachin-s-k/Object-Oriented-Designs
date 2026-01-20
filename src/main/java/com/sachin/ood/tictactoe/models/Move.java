package com.sachin.ood.tictactoe.models;

public class Move {

    public Symbol getSymbol() {
        return symbol;
    }

    private Symbol symbol;
    private Player player;



    private Cell cell;



    public Player getPlayer() {
        return player;
    }



    public Cell getCell() {
        return cell;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }



    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }




}
