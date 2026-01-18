package com.sachin.objectorienteddesigns.strategies.winningStrategies;

import com.sachin.objectorienteddesigns.models.Board;
import com.sachin.objectorienteddesigns.models.Cell;
import com.sachin.objectorienteddesigns.models.Move;
import com.sachin.objectorienteddesigns.models.Player;

import java.util.HashMap;
import java.util.List;

public interface GameWinningStrategy {



   boolean checkIfWon(Board board, Player player, Cell moveCell);
}
