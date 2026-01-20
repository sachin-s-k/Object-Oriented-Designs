package com.sachin.ood.tictactoe.strategies.winningStrategies;

import com.sachin.ood.tictactoe.models.Board;
import com.sachin.ood.tictactoe.models.Cell;
import com.sachin.ood.tictactoe.models.Player;

public interface GameWinningStrategy {



   boolean checkIfWon(Board board, Player player, Cell moveCell);
}
