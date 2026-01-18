package com.sachin.objectorienteddesigns.factories.botPlayingStrategyFactory;

import com.sachin.objectorienteddesigns.models.DifficultyLevel;
import com.sachin.objectorienteddesigns.strategies.boatplayingstrategies.BotPlayingStrategies;
import com.sachin.objectorienteddesigns.strategies.boatplayingstrategies.RandomPlayingStrategy;

public class BotPlayingStrategyFactory {


    public BotPlayingStrategies createBotPlayingStrategyForDifficultyLevel(
            DifficultyLevel difficultyLevel) {

        return switch (difficultyLevel) {
            case EASY, MEDIUM, HARD,UNDEFINED -> new RandomPlayingStrategy();
        };
    }

};
