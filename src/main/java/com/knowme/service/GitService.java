package com.knowme.service;

import com.knowme.entity.GitOwner;

import java.io.IOException;

/**
 * @author Dhiraj Jadhavrao
 * */
public interface GitService {
    GitOwner getGitProfileDetails() throws IOException;
    String getListOfGitRepositories();
}
