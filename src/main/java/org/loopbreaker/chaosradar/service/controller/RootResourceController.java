package org.loopbreaker.chaosradar.service.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootResourceController {

    public RootResourceController() {
    }

    public HttpEntity<String> getRootResource() {
        return new ResponseEntity<>("bob", HttpStatus.OK);
    }
}
