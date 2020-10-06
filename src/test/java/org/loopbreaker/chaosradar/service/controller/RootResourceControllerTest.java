package org.loopbreaker.chaosradar.service.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;


@SpringBootTest
public class RootResourceControllerTest {

    @Autowired
    private RootResourceController controller;

    @Test
    public void testContextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void testRootResource() {
        assertThat(controller.getRootResource()).isNotNull();
    }

    @Test
    public void testRootResourceHasBody() {
        assertThat(controller.getRootResource().getBody()).isNotNull();
    }

    @Test
    public void testRootResourceHasLinks() {
        assertThat(controller.getRootResource().getBody().getLink("_links").isPresent());
    }

    @Test
    public void testRootResourceHasHttpOk() {
        assertThat(controller.getRootResource().getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
