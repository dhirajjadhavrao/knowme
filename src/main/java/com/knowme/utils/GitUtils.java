package com.knowme.utils;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;

/**
 * @author Dhiraj Jadhavrao
 * */
@Component
public class GitUtils {

    @Value("${GIT_HUB_TOKEN}")
    private String gitToken;

    public GitHub getGitHub(){
        GitHub github = null;
        try {
            github = new GitHubBuilder().withOAuthToken(gitToken).build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return github;
    }
}
