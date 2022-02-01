package com.knowme.controller;

import com.knowme.service.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author Dhiraj Jadhavrao
 * */
@RestController(value = "/gitdetails")
public class GitController {

    @Autowired
    private ServiceManager serviceManager;

    @GetMapping("/profile")
    public ResponseEntity getGitProfileDetails() throws IOException {
        return ResponseEntity.ok(serviceManager.getGitService().getGitProfileDetails());
    }

    @GetMapping("/repos")
    public ResponseEntity getReposList(){
        return null;
    }
}
