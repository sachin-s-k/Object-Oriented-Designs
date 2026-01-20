package com.sachin.ood.tictactoe.models;

import com.sachin.ood.tictactoe.Exceptions.EmptyMovesUndoOperationException;
import com.sachin.ood.tictactoe.Exceptions.MultipleBotException;
import com.sachin.ood.tictactoe.strategies.winningStrategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
  // List of players
  private List<Player> players;

    public Board getBoard() {
        return board;
    }

    // Game Board
  private Board board;
  // undo operations
  private List<Move> moves;
  // list of winning strategy
  private List<GameWinningStrategy> gameWinningStrategies;
  // the last player moved index
  private int lastPlayerMovedindex;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    // Game status
  private GameStatus gameStatus;


    public Player getWinner() {
        return winner;
    }

    // the winner player
  private Player winner;
  private int numberOfFilledCells;


private Game (){
  this.gameWinningStrategies=new ArrayList<>();
  this.moves= new ArrayList<>();
  this.players= new ArrayList<>();
  this.lastPlayerMovedindex=-1;
  this.gameStatus= GameStatus.INPROGRESS;


}

    public static Builder create() {
        return new Builder();
    }

  public static class Builder{

    private List<Player> players;
    private int dimension;
    private List<GameWinningStrategy> gameWinningStrategies;
    Builder(){
      this.players= new ArrayList<>();
      this.gameWinningStrategies=new ArrayList<>();
    }

public Builder addPlayer(Player player){
this.players.add(player);
return this;

}

      public Builder addPlayers(List<Player> players) {
          this.players.addAll(players);

          return this;
      }
public  Builder addGameWinningStrategy(GameWinningStrategy gameWinningStrategy){
      this.gameWinningStrategies.add(gameWinningStrategy);
      return  this;
}
      public Builder addGameWinningStrategies(List<GameWinningStrategy> strategies) {
          this.gameWinningStrategies.addAll(strategies);
          return this;
      }
public Builder setDimension(int dimension){
   this.dimension=dimension;
   return this;
    }


    private boolean checkIfSingleBotMax(){
      int count=0;
      for(Player player:players){
        if(player.getPlayerType().equals(PlayerType.BOT )){
          count++;
        }
      }
      return count<=1;
    }


public Game build() throws MultipleBotException{
      if(!checkIfSingleBotMax()){
        throw new MultipleBotException();

      }

      Game game= new Game();
      game.players.addAll(this.players);
      game.gameWinningStrategies.addAll(this.gameWinningStrategies);
      game.board= new Board(this.dimension);



      return  game;

}

  }

    public void makeMove(){
        this.lastPlayerMovedindex++;
        this.lastPlayerMovedindex%=this.players.size();
        Move move=
                this.players.get(this.lastPlayerMovedindex).makeMove(this.board);
        move.getCell().setSymbol(move.getSymbol());
    moves.add(move);

        for(GameWinningStrategy strategy:this.gameWinningStrategies){
            if(strategy.checkIfWon(this.board,this.players.get(lastPlayerMovedindex),move.getCell())){
                gameStatus= GameStatus.ENDED;
                this.winner=this.players.get(lastPlayerMovedindex);
                break;

            }
        }

        if(moves.size()==this.board.getDimension()*this.board.getDimension()){
            gameStatus= GameStatus.DRAW;
            return;

        }

    }
    public boolean undo() throws EmptyMovesUndoOperationException {
    if(this.moves.size()==0){
        throw  new EmptyMovesUndoOperationException();
    }

    Move lastMove=this.moves.get(this.moves.size()-1);
    Cell relevant=lastMove.getCell();
    relevant.clearCell();
    this.lastPlayerMovedindex-=1;
    this.lastPlayerMovedindex=(this.lastPlayerMovedindex+this.players.size())%this.players.size();
    this.moves.remove(lastMove);
    return  true;



    }





}
