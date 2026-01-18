package com.sachin.objectorienteddesigns.controllers;

import com.sachin.objectorienteddesigns.Exceptions.EmptyMovesUndoOperationException;
import com.sachin.objectorienteddesigns.models.Game;
import com.sachin.objectorienteddesigns.models.GameStatus;
import com.sachin.objectorienteddesigns.models.Player;
import com.sachin.objectorienteddesigns.strategies.winningStrategies.GameWinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimension,
                           List<Player> players,
                           List<GameWinningStrategy> strategies){
        Game game= null;
        try{

            game= Game.
                    create().setDimension(dimension).
                    addPlayers(players).
                    addGameWinningStrategies(strategies).
                    build();


        }catch (Exception exception){
            System.out.println(" We did something wrong");
            exception.printStackTrace();

        }


return game;
    }

    public boolean undo(Game game) throws EmptyMovesUndoOperationException {
        return game.undo();

    }

    public void makeMove(Game game){
        game.makeMove();

    }

    public  Player getWinner(Game game){
        return game.getWinner();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void display(Game game){
        game.getBoard().printBoard();
    }


}
