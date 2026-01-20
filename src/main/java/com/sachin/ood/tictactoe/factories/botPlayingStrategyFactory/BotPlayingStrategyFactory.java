package com.sachin.ood.tictactoe.factories.botPlayingStrategyFactory;

import com.sachin.ood.tictactoe.models.DifficultyLevel;
import com.sachin.ood.tictactoe.strategies.boatplayingstrategies.BotPlayingStrategies;
import com.sachin.ood.tictactoe.strategies.boatplayingstrategies.RandomPlayingStrategy;

public class BotPlayingStrategyFactory {


    public BotPlayingStrategies createBotPlayingStrategyForDifficultyLevel(
            DifficultyLevel difficultyLevel) {

        return switch (difficultyLevel) {
            case EASY, MEDIUM, HARD,UNDEFINED -> new RandomPlayingStrategy();
        };
    }

};
