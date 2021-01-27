package org.loopbreaker.chaosradar.service.service;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ChaosRadarServiceTest {

    @Test
    public void testGetRadarsHasNoRadars() {
        final ChaosRadarService service = new ChaosRadarService();
        assertThat(service.getRadars(), IsEmptyCollection.empty());
    }
}
