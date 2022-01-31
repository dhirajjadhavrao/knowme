package com.knowme.controller;

import com.knowme.service.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dhiraj Jadhavrao
 * */
@RestController
public class GitController {

    @Autowired
    private ServiceManager serviceManager;

    @GetMapping("/gitdetails")
    public ResponseEntity getGitProfileDetails(){
        return ResponseEntity.ok(serviceManager.getGitService().getGitProfileDetails());
    }
}
