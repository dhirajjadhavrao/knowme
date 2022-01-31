package com.knowme.service.impl;

import com.knowme.service.GitService;
import com.knowme.utils.GitUtils;
import org.kohsuke.github.GHMyself;
import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

/**
 * @author Dhiraj Jadhavrao
 * */
@Service
public class GitServiceImpl implements GitService {

    @Autowired
    private GitUtils gitUtils;

    @Override
    public String getGitRepositoryData() {
        return getGitProfile();
    }

    private String getGitProfile() {
        try {
            GitHub github = gitUtils.getGitHub();
            GHMyself ghMyself =  github.getMyself();
            return ghMyself.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
