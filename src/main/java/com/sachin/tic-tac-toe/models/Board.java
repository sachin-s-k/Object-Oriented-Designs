package com.sachin.objectorienteddesigns.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

 private int dimension;
 private List<List<com.sachin.objectorienteddesigns.models.Cell>> board;


    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<com.sachin.objectorienteddesigns.models.Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<com.sachin.objectorienteddesigns.models.Cell>> board) {
        this.board = board;
    }
 public Board(int dimension){
     this.dimension= dimension;

     board = new ArrayList<>();
     for (int i=0;i<dimension;++i){
board.add(new ArrayList<>());
         for(int j=0;j<dimension; ++j){

board.get(i).add(new com.sachin.objectorienteddesigns.models.Cell());
         }

     }


 }


 public com.sachin.objectorienteddesigns.models.Cell getCell(int i , int j){
        return board.get(i).get(j);
 }

 public  void printBoard(){
        for (List<com.sachin.objectorienteddesigns.models.Cell> row:board){

            for (com.sachin.objectorienteddesigns.models.Cell cell:row){
                if(cell.getSymbol() ==null){

                    System.out.printf("|  |");
                }else{
                    System.out.printf("|"+cell.getSymbol().getCharacter()+"|");


                }
            }
            System.out.print("\n");

        }
 }



}
