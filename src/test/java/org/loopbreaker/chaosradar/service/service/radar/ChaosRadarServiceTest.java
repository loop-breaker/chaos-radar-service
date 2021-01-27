package org.loopbreaker.chaosradar.service.service.radar;

import io.vavr.control.Either;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.core.Is.is;

public class ChaosRadarServiceTest {

    @Test
    public void testGetRadarsHasNoRadars() {
        final ChaosRadarService service = new ChaosRadarService();
        assertThat(service.getRadarsByName(), empty());
    }

    @Test
    public void testAddingNewRadarCreatesANewRadar() {
        final ChaosRadarService service = new ChaosRadarService();
        final Radar radar = new Radar("New Radar");
        Either<String, UUID> result = service.createRadar(radar);
        assertThat(result.get(), is(notNullValue()));
    }

    @Test
    public void testAddingNewRadarFailsWithAlreadyExistingName() {
        final ChaosRadarService service = new ChaosRadarService();
        final Radar radar = new Radar("Duplicate Name");
        service.createRadar(radar);
        Either<String, UUID> result = service.createRadar(radar);
        assertThat(result.getLeft(), is("Radar already exists"));
    }

    @Test
    public void testGetRadarByIdReturnsCorrectRadar() {
        final ChaosRadarService service = new ChaosRadarService();
        final Either<String, UUID> result = service.createRadar(new Radar("Name"));
        final Radar retrievedRadar = service.getRadar(result.get());
        assertThat(retrievedRadar, is(notNullValue()));
    }
}
