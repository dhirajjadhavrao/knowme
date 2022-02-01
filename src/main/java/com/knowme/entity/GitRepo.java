package com.knowme.entity;

import javax.persistence.*;

@Entity(name = "GIT_REPO")
public class GitRepo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long repoId;
    @Column(name = "GIT_REPO_ID")
    private Long gitRepoId;
    @Column(name = "REPO_NAME")
    private String repoName;
    @Column(name = "HTML_URL")
    private String htmlUrl;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "API_URL")
    private String apiUrl;
    @Column(name = "DOWNLOADS_URL")
    private String downloadsUrl;
    @Column(name = "GIT_URL")
    private String gitUrl;
    @Column(name = "CLONE_URL")
    private String cloneUrl;
    @Column(name = "LANGUAGE")
    private String language;
    @Column(name = "OPEN_ISSUES")
    private String openIssues;

    @ManyToOne()
    private GitOwner gitOwner;

    public Long getRepoId() {
        return repoId;
    }

    public void setRepoId(Long repoId) {
        this.repoId = repoId;
    }

    public Long getGitRepoId() {
        return gitRepoId;
    }

    public void setGitRepoId(Long gitRepoId) {
        this.gitRepoId = gitRepoId;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(String openIssues) {
        this.openIssues = openIssues;
    }

    public GitOwner getGitOwner() {
        return gitOwner;
    }

    public void setGitOwner(GitOwner gitOwner) {
        this.gitOwner = gitOwner;
    }
}
