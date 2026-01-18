package com.sachin.objectorienteddesigns.models;

public class Cell {
    private int row;
    private  int column;
    private com.sachin.objectorienteddesigns.models.Symbol symbol;



    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public com.sachin.objectorienteddesigns.models.Symbol getSymbol() {
        return symbol;
    }
    public void setSymbol(com.sachin.objectorienteddesigns.models.Symbol symbol) {
        this.symbol = symbol;
    }
    public boolean isEmpty(){
        return symbol==null;

    }

    public void clearCell(){
        this.symbol=null;


    }


}
