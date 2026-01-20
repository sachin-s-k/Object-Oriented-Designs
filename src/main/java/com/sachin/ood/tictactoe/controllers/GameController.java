package com.sachin.ood.tictactoe.controllers;

import com.sachin.ood.tictactoe.Exceptions.EmptyMovesUndoOperationException;
import com.sachin.ood.tictactoe.models.Game;
import com.sachin.ood.tictactoe.models.GameStatus;
import com.sachin.ood.tictactoe.models.Player;
import com.sachin.ood.tictactoe.strategies.winningStrategies.GameWinningStrategy;

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
