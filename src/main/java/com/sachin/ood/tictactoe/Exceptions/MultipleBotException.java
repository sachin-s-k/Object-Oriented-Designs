package com.sachin.ood.tictactoe.Exceptions;

public class MultipleBotException extends Exception{
    public MultipleBotException(){
        super("A game cannot have more than one bot players.");
    }

}
