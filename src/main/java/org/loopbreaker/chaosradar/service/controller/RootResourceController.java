package org.loopbreaker.chaosradar.service.controller;


import org.loopbreaker.chaosradar.service.resource.RootResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class RootResourceController {

    public RootResourceController() {
    }

    @GetMapping
    public ResponseEntity<RootResource> getRootResource() {
        return ResponseEntity.of(Optional.of(new RootResource()));
    }
}
