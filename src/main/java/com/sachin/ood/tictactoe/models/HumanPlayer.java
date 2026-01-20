package com.sachin.ood.tictactoe.models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    String email;
    String realName;

    public HumanPlayer(Symbol symbol){
        super(symbol, PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("print row number:-");
        Scanner myObj=new Scanner(System.in);
        int row =myObj.nextInt();

        System.out.println("print column number:-");
        int column= myObj.nextInt();
        Move move = new Move();
        move.setCell(board.getCell(row-1, column-1));
       move.setPlayer(this);
       move.setSymbol(this.getSymbol());
       return  move;

    }
};
