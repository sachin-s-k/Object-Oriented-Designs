package com.sachin.ood.tictactoe.strategies.winningStrategies;

import com.sachin.ood.tictactoe.models.Board;
import com.sachin.ood.tictactoe.models.Cell;
import com.sachin.ood.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    private List<HashMap<Character,Integer>> rowCharCount;
    private  List<HashMap<Character,Integer>>colCharCount;

    private void initalizeCounts(Board board){
         rowCharCount=new ArrayList<>();
         colCharCount=new ArrayList<>();
         for (int i=0;i< board.getDimension();i++){
             rowCharCount.add(new HashMap<>());
             colCharCount.add(new HashMap<>());

         }

    }
    @Override
    public boolean checkIfWon(Board board, Player player, Cell moveCell) {

if(rowCharCount==null){
    initalizeCounts(board);

}
int row= moveCell.getRow();
int col= moveCell.getColumn();
if(!rowCharCount.get(row).containsKey(moveCell.getSymbol().getCharacter())){
    rowCharCount.get(row).put(moveCell.getSymbol().getCharacter(),0);
}
        if(!colCharCount.get(col).containsKey(moveCell.getSymbol().getCharacter())){
            colCharCount.get(col).put(moveCell.getSymbol().getCharacter(),0);
        }

        rowCharCount.get(row).put(moveCell.getSymbol().getCharacter(), 1+rowCharCount.get(row).get(moveCell.getSymbol().getCharacter()));
        colCharCount.get(col).put(moveCell.getSymbol().getCharacter(), 1+colCharCount.get(col).get(moveCell.getSymbol().getCharacter()));

if(rowCharCount.get(row).get(moveCell.getSymbol().getCharacter()).equals(board.getDimension())){
    return  true;
}
        if(   colCharCount.get(col).get(moveCell.getSymbol().getCharacter()).equals(board.getDimension())){
            return  true;
        }

        return  false;
    }

}
