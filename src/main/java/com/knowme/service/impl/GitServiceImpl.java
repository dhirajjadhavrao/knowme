package com.knowme.service.impl;

import com.knowme.entity.GitOwner;
import com.knowme.repository.GitOwnerDao;
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

    @Autowired
    private GitOwnerDao gitOwnerDao;

    @Override
    public String getGitProfileDetails() {
        GitOwner owner = new GitOwner();
        owner.setGitId(100L);
        owner.setName("Test");
        owner = gitOwnerDao.save(owner);
        System.out.println(owner.getId());
        return getGitProfile();
    }

    @Override
    public String getListOfGitRepositories() {
        return null;
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
