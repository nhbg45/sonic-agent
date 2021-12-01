package com.sonic.agent.maps;

import javax.websocket.Session;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

public class MiniCapMap {
    private static Map<Session, Future<?>> miniCapMap = new ConcurrentHashMap<>();

    public static Map<Session, Future<?>> getMap() {
        return miniCapMap;
    }
}
