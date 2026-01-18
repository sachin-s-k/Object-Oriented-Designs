package com.sachin.objectorienteddesigns.strategies.boatplayingstrategies;

import com.sachin.objectorienteddesigns.models.*;
import com.sachin.objectorienteddesigns.models.Board;
import com.sachin.objectorienteddesigns.models.Cell;
import com.sachin.objectorienteddesigns.models.Move;
import com.sachin.objectorienteddesigns.models.Player;

import java.util.List;

public class RandomPlayingStrategy implements com.sachin.objectorienteddesigns.strategies.boatplayingstrategies.BotPlayingStrategies {
    @Override
    public Move makeMove(Board board, Player player) {
      for(List<Cell> row:board.getBoard()){
          for(Cell cell:row){
              if(cell.isEmpty()){
                  Move move= new Move();
                  move.setPlayer(player);
                  move.setSymbol(player.getSymbol());
                  move.setCell(cell);
return  move;
              }
          }
      }
      return  null;
    }
}
