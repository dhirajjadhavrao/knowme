package com.knowme.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity(name = "GIT_OWNER")
public class GitOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "GIT_ID")
    private Long gitId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "COMPANY")
    private String company;
    @Column(name = "ACCOUNT_SINCE")
    private Long accountSince;
    @Column(name = "HIREABLE")
    private Boolean hireable;
    @Column(name = "BLOG")
    private String blog;
    @Column(name = "API_URL")
    private String apiUrl;
    @Column(name = "FOLLOWERS")
    private Integer followers;
    @Column(name = "FOLLOWING")
    private Integer following;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "NODE_ID")
    private String nodeId;
    @Column(name = "LAST_UPDATED")
    private Long lastUpdated;
    @Column(name = "CREATED_AT")
    private Long createdAt;
    @Column(name = "UPDATED_AT")
    private Long updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGitId() {
        return gitId;
    }

    public void setGitId(Long gitId) {
        this.gitId = gitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getAccountSince() {
        return accountSince;
    }

    public void setAccountSince(Long accountSince) {
        this.accountSince = accountSince;
    }

    public Boolean getHireable() {
        return hireable;
    }

    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
