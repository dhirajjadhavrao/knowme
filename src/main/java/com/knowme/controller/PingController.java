package com.knowme.controller;

import com.knowme.service.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Autowired
    private ServiceManager serviceManager;

    @GetMapping("/ping")
    public ResponseEntity<?> getPing(){
        return ResponseEntity.ok(serviceManager.getPingService().getPing());
    }
}
