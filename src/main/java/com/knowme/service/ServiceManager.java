package com.knowme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceManager {
    @Autowired
    private PingService pingService;

    public PingService getPingService() {
        return pingService;
    }

    public void setPingService(PingService pingService) {
        this.pingService = pingService;
    }
}
