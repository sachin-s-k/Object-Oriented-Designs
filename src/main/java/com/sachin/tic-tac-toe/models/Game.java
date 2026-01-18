package com.sachin.objectorienteddesigns.models;

import com.sachin.objectorienteddesigns.Exceptions.EmptyMovesUndoOperationException;
import com.sachin.objectorienteddesigns.Exceptions.MultipleBotException;
import com.sachin.objectorienteddesigns.strategies.winningStrategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
  // List of players
  private List<com.sachin.objectorienteddesigns.models.Player> players;

    public com.sachin.objectorienteddesigns.models.Board getBoard() {
        return board;
    }

    // Game Board
  private com.sachin.objectorienteddesigns.models.Board board;
  // undo operations
  private List<com.sachin.objectorienteddesigns.models.Move> moves;
  // list of winning strategy
  private List<GameWinningStrategy> gameWinningStrategies;
  // the last player moved index
  private int lastPlayerMovedindex;

    public com.sachin.objectorienteddesigns.models.GameStatus getGameStatus() {
        return gameStatus;
    }

    // Game status
  private com.sachin.objectorienteddesigns.models.GameStatus gameStatus;


    public com.sachin.objectorienteddesigns.models.Player getWinner() {
        return winner;
    }

    // the winner player
  private com.sachin.objectorienteddesigns.models.Player winner;
  private int numberOfFilledCells;


private Game (){
  this.gameWinningStrategies=new ArrayList<>();
  this.moves= new ArrayList<>();
  this.players= new ArrayList<>();
  this.lastPlayerMovedindex=-1;
  this.gameStatus= com.sachin.objectorienteddesigns.models.GameStatus.INPROGRESS;


}

    public static Builder create() {
        return new Builder();
    }

  public static class Builder{

    private List<com.sachin.objectorienteddesigns.models.Player> players;
    private int dimension;
    private List<GameWinningStrategy> gameWinningStrategies;
    Builder(){
      this.players= new ArrayList<>();
      this.gameWinningStrategies=new ArrayList<>();
    }

public Builder addPlayer(com.sachin.objectorienteddesigns.models.Player player){
this.players.add(player);
return this;

}

      public Builder addPlayers(List<com.sachin.objectorienteddesigns.models.Player> players) {
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
      for(com.sachin.objectorienteddesigns.models.Player player:players){
        if(player.getPlayerType().equals(com.sachin.objectorienteddesigns.models.PlayerType.BOT )){
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
      game.board= new com.sachin.objectorienteddesigns.models.Board(this.dimension);



      return  game;

}

  }

    public void makeMove(){
        this.lastPlayerMovedindex++;
        this.lastPlayerMovedindex%=this.players.size();
        com.sachin.objectorienteddesigns.models.Move move=
                this.players.get(this.lastPlayerMovedindex).makeMove(this.board);
        move.getCell().setSymbol(move.getSymbol());
    moves.add(move);

        for(GameWinningStrategy strategy:this.gameWinningStrategies){
            if(strategy.checkIfWon(this.board,this.players.get(lastPlayerMovedindex),move.getCell())){
                gameStatus= com.sachin.objectorienteddesigns.models.GameStatus.ENDED;
                this.winner=this.players.get(lastPlayerMovedindex);
                break;

            }
        }

        if(moves.size()==this.board.getDimension()*this.board.getDimension()){
            gameStatus= com.sachin.objectorienteddesigns.models.GameStatus.DRAW;
            return;

        }

    }
    public boolean undo() throws EmptyMovesUndoOperationException {
    if(this.moves.size()==0){
        throw  new EmptyMovesUndoOperationException();
    }

    com.sachin.objectorienteddesigns.models.Move lastMove=this.moves.get(this.moves.size()-1);
    com.sachin.objectorienteddesigns.models.Cell relevant=lastMove.getCell();
    relevant.clearCell();
    this.lastPlayerMovedindex-=1;
    this.lastPlayerMovedindex=(this.lastPlayerMovedindex+this.players.size())%this.players.size();
    this.moves.remove(lastMove);
    return  true;



    }





}
