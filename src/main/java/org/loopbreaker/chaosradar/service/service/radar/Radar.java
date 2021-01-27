package org.loopbreaker.chaosradar.service.service.radar;

import java.util.UUID;

public class Radar extends AbstractEntity {

    private String name;

    public Radar(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public Radar(final String name) {
        this(null, name);
    }

    public String getName() {
        return name;
    }
}
