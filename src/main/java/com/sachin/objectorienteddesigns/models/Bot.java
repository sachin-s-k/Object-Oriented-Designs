package com.sachin.objectorienteddesigns.models;

import com.sachin.objectorienteddesigns.factories.botPlayingStrategyFactory.BotPlayingStrategyFactory;
import com.sachin.objectorienteddesigns.strategies.boatplayingstrategies.BotPlayingStrategies;

public class Bot extends Player{

  private   DifficultyLevel botDifficultyLevel;
  private BotPlayingStrategies botPlayingStrategy;
  public Bot(Symbol symbol, DifficultyLevel difficultyLevel){
      super(symbol,PlayerType.BOT);
      botPlayingStrategy=new BotPlayingStrategyFactory().createBotPlayingStrategyForDifficultyLevel(difficultyLevel);

  }

    @Override
    public Move makeMove(Board board) {
        return this.botPlayingStrategy.makeMove(board, this);
    }

}
