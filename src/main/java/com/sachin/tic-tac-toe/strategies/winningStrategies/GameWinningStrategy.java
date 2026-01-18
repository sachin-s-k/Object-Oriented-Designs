package com.sachin.objectorienteddesigns.strategies.winningStrategies;

import com.sachin.objectorienteddesigns.models.Board;
import com.sachin.objectorienteddesigns.models.Cell;
import com.sachin.objectorienteddesigns.models.Player;

public interface GameWinningStrategy {



   boolean checkIfWon(Board board, Player player, Cell moveCell);
}
