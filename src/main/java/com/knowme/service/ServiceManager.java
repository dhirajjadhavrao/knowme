package com.knowme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Dhiraj Jadhavrao
 * */
@Component
public class ServiceManager {
    @Autowired
    private PingService pingService;

    @Autowired
    private GitService gitService;

    public GitService getGitService() {
        return gitService;
    }

    public void setGitService(GitService gitService) {
        this.gitService = gitService;
    }

    public PingService getPingService() {
        return pingService;
    }

    public void setPingService(PingService pingService) {
        this.pingService = pingService;
    }
}
