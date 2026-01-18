package com.sachin.objectorienteddesigns.models;

import java.util.Scanner;

public class HumanPlayer extends com.sachin.objectorienteddesigns.models.Player {
    String email;
    String realName;

    public HumanPlayer(com.sachin.objectorienteddesigns.models.Symbol symbol){
        super(symbol, com.sachin.objectorienteddesigns.models.PlayerType.HUMAN);
    }

    @Override
    public com.sachin.objectorienteddesigns.models.Move makeMove(com.sachin.objectorienteddesigns.models.Board board) {
        System.out.println("print row number:-");
        Scanner myObj=new Scanner(System.in);
        int row =myObj.nextInt();

        System.out.println("print column number:-");
        int column= myObj.nextInt();
        com.sachin.objectorienteddesigns.models.Move move = new com.sachin.objectorienteddesigns.models.Move();
        move.setCell(board.getCell(row-1, column-1));
       move.setPlayer(this);
       move.setSymbol(this.getSymbol());
       return  move;

    }
};
