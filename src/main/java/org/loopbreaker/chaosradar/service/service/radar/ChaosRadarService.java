package org.loopbreaker.chaosradar.service.service.radar;

import io.vavr.control.Either;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ChaosRadarService {

    private final Map<String, Radar> radarsByName = new HashMap<>();
    private final Map<UUID, Radar> radarsByUUID = new HashMap<>();


    public List<Radar> getRadars() {
        return List.copyOf(radarsByName.values());
    }

    public Radar getRadarsByName(final String name) {
        return radarsByName.get(name);
    }

    public Either<String, UUID> createRadar(Radar radar) {
        if (radarsByName.get(radar.getName()) == null) {
            final Radar serviceRadar = new Radar(UUID.randomUUID(), radar.getName());
            radarsByName.put(serviceRadar.getName(), serviceRadar);
            radarsByUUID.put(serviceRadar.getId(), serviceRadar);
            return Either.right(serviceRadar.getId());
        } else {
            return Either.left("Radar already exists");
        }
    }

    public Radar getRadar(UUID uuid) {
        return radarsByUUID.get(uuid);
    }
}
