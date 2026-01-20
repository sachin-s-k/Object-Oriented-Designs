package com.sachin.ood.tictactoe.strategies.boatplayingstrategies;

import com.sachin.ood.tictactoe.models.Board;
import com.sachin.ood.tictactoe.models.Move;
import com.sachin.ood.tictactoe.models.Player;

public interface BotPlayingStrategies {
    Move makeMove(Board board, Player player);
}
