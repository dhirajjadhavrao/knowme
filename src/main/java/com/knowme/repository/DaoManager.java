package com.knowme.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Dhiraj Jadhavrao
 * */
@Component
public class DaoManager {
    @Autowired
    private GitOwnerDao gitOwnerDao;

    public GitOwnerDao getGitOwnerDao() {
        return gitOwnerDao;
    }

    public void setGitOwnerDao(GitOwnerDao gitOwnerDao) {
        this.gitOwnerDao = gitOwnerDao;
    }
}
