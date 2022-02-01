package com.knowme.service.impl;

import com.knowme.entity.GitOwner;
import com.knowme.repository.DaoManager;
import com.knowme.service.GitService;
import com.knowme.utils.GitUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    private static final Logger logger = LogManager.getLogger(GitServiceImpl.class);

    @Autowired
    private GitUtils gitUtils;

    @Autowired
    private DaoManager daoManager;

    @Override
    public GitOwner getGitProfileDetails() throws IOException {
        logger.info("Start GitServiceImpl : getGitProfileDetails()");
        GitOwner owner = null;
        GHMyself ghMyself = fetchGitProfileFromGIT();

        if(ghMyself != null){
            owner = daoManager.getGitOwnerDao().findByGitId(ghMyself.getId());
            if(owner == null){
                owner = new GitOwner();
            }

            owner.setGitId(ghMyself.getId());
            owner.setName(ghMyself.getName());
            owner.setEmail(ghMyself.getEmail());
            owner.setDesignation(ghMyself.getBio());
            owner.setCompany(ghMyself.getCompany());
            /*TODO : Date format change
            owner.setAccountSince(Long.valueOf(String.valueOf(ghMyself.getCreatedAt())));*/
            owner.setHireable(ghMyself.isHireable());
            owner.setBlog(ghMyself.getBlog());
            owner.setApiUrl(ghMyself.getUrl().toString());
            owner.setFollowers(ghMyself.getFollowersCount());
            owner.setFollowing(ghMyself.getFollowingCount());
            owner.setLocation(ghMyself.getLocation());
            owner.setLogin(ghMyself.getLogin());
            owner.setType(ghMyself.getType());
            owner.setNodeId(ghMyself.getNodeId());
            /*TODO : Date format change
            owner.setLastUpdated(Long.valueOf(String.valueOf(ghMyself.getUpdatedAt())));*/
            owner.setCreatedAt(System.currentTimeMillis());
            owner.setUpdatedAt(System.currentTimeMillis());


            owner = daoManager.getGitOwnerDao().save(owner);
        }
        return owner;
    }

    @Override
    public String getListOfGitRepositories() {
        return null;
    }

    private GHMyself fetchGitProfileFromGIT() {
        logger.info("Start GitServiceImpl : fetchGitProfileFromGIT()");
        try {
            GitHub github = gitUtils.getGitHub();
            GHMyself ghMyself =  github.getMyself();
            return ghMyself;
        } catch (IOException e) {
            logger.info("Error at GitServiceImpl : fetchGitProfileFromGIT() Exception ", e);
        }
        logger.info("End GitServiceImpl : fetchGitProfileFromGIT()");
        return null;
    }
}
