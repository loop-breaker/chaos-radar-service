package org.loopbreaker.chaosradar.service.service.radar;

import java.util.UUID;

public abstract class AbstractEntity {
    private UUID id;

    protected AbstractEntity(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
