package com.sachin.objectorienteddesigns;

import com.sachin.ood.tictactoe.controllers.GameController;
import com.sachin.objectorienteddesigns.models.*;
import com.sachin.ood.tictactoe.models.Bot;
import com.sachin.ood.tictactoe.models.DifficultyLevel;
import com.sachin.ood.tictactoe.models.Game;
import com.sachin.ood.tictactoe.models.GameStatus;
import com.sachin.ood.tictactoe.models.HumanPlayer;
import com.sachin.ood.tictactoe.models.Player;
import com.sachin.ood.tictactoe.models.Symbol;
import com.sachin.ood.tictactoe.strategies.winningStrategies.GameWinningStrategy;
import com.sachin.ood.tictactoe.strategies.winningStrategies.OrderOneGameWinningStrategy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GameSimulator {

    public static void main(String[] args) {

 int dimension=3;
        Player p1= new HumanPlayer(new Symbol('X'));
        Player p2 = new Bot(new Symbol('O'), DifficultyLevel.EASY);

        GameWinningStrategy strategy =new OrderOneGameWinningStrategy();
        GameController gameController= new GameController();
       Game game= gameController.createGame(dimension, List.of(p1,p2),List.of(strategy));
   while(gameController.getGameStatus(game).equals(GameStatus.INPROGRESS)){
       System.out.println("Please Make the Next Move. This is current Status");
       gameController.display(game);
       gameController.makeMove(game);

   }



if(gameController.getGameStatus(game).equals(GameStatus.ENDED)){
    gameController.display(game);
    System.out.println("WInner ");

}

    }

}
