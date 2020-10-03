package org.loopbreaker.chaosradar.service.resource;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RootResourceTest {

    @Test
    public void testRootResourceHasLinks() {
        RootResource rootResource = new RootResource();
        assertThat(rootResource.getLinks("_links")).isNotNull();
    }
}
