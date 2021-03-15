package com.tech.bwindie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeat {
    private static final Logger log = LoggerFactory.getLogger(HeartBeat.class);

    @GetMapping("/heartbeat")
    public ResponseEntity<?> index() {
        log.info("Bwindie Heartbeat invoked");
        return ResponseEntity.ok("{\"status\" : \"ok\"}");
    }
}
