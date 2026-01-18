package com.sachin.objectorienteddesigns.models;

import com.sachin.objectorienteddesigns.factories.botPlayingStrategyFactory.BotPlayingStrategyFactory;
import com.sachin.objectorienteddesigns.strategies.boatplayingstrategies.BotPlayingStrategies;

public class Bot extends com.sachin.objectorienteddesigns.models.Player {

  private com.sachin.objectorienteddesigns.models.DifficultyLevel botDifficultyLevel;
  private BotPlayingStrategies botPlayingStrategy;
  public Bot(com.sachin.objectorienteddesigns.models.Symbol symbol, com.sachin.objectorienteddesigns.models.DifficultyLevel difficultyLevel){
      super(symbol, com.sachin.objectorienteddesigns.models.PlayerType.BOT);
      botPlayingStrategy=new BotPlayingStrategyFactory().createBotPlayingStrategyForDifficultyLevel(difficultyLevel);

  }

    @Override
    public com.sachin.objectorienteddesigns.models.Move makeMove(com.sachin.objectorienteddesigns.models.Board board) {
        return this.botPlayingStrategy.makeMove(board, this);
    }

}
