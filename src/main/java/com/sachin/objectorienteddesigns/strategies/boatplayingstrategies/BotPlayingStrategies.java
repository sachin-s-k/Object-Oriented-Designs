package com.sachin.objectorienteddesigns.strategies.boatplayingstrategies;

import com.sachin.objectorienteddesigns.models.Board;
import com.sachin.objectorienteddesigns.models.Move;
import com.sachin.objectorienteddesigns.models.Player;
import com.sachin.objectorienteddesigns.models.Symbol;

public interface BotPlayingStrategies {
    Move makeMove(Board board, Player player);
}
