package com.mycompany.busticketbooking;

import java.util.HashMap;
import java.util.Map;

class MetroStation {
    String name;
    Map<MetroStation, Integer> connections = new HashMap<>(); // Connected stations and distances

    public MetroStation(String name) {
        this.name = name;
    }

    public void addConnection(MetroStation station, int distance) {
        connections.put(station, distance);
    }
}
