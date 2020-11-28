package org.loopbreaker.chaosradar.service.service;


import java.util.ArrayList;
import java.util.List;

public class ChaosRadarService {
    private final List<Radar> radars = new ArrayList<>();

    public List<Radar> getRadars() {
        return radars;
    }
}
