package com.jackvine.teamcity.agentWaker;

import jetbrains.buildServer.AgentRestrictor;
import jetbrains.buildServer.serverSide.AddToQueuePreprocessor;
import jetbrains.buildServer.serverSide.BuildPromotion;
import jetbrains.buildServer.serverSide.ServerExtension;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class AppServer implements AddToQueuePreprocessor {

    @NotNull
    @Override
    public Map<BuildPromotion, AgentRestrictor> preprocess(@NotNull Map<BuildPromotion, AgentRestrictor> map, @NotNull String s) {
        map.clear();
        return map;
    }

}
