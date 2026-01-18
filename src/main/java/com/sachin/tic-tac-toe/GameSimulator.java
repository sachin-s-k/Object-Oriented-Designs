package com.sachin.objectorienteddesigns;

import com.sachin.objectorienteddesigns.controllers.GameController;
import com.sachin.objectorienteddesigns.models.*;
import com.sachin.objectorienteddesigns.models.Bot;
import com.sachin.objectorienteddesigns.models.DifficultyLevel;
import com.sachin.objectorienteddesigns.models.Game;
import com.sachin.objectorienteddesigns.models.GameStatus;
import com.sachin.objectorienteddesigns.models.HumanPlayer;
import com.sachin.objectorienteddesigns.models.Player;
import com.sachin.objectorienteddesigns.models.Symbol;
import com.sachin.objectorienteddesigns.strategies.winningStrategies.GameWinningStrategy;
import com.sachin.objectorienteddesigns.strategies.winningStrategies.OrderOneGameWinningStrategy;
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
