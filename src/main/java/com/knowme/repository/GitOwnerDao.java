package com.knowme.repository;

import com.knowme.entity.GitOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitOwnerDao extends JpaRepository<GitOwner, Long> {
    @Override
    GitOwner getById(Long id);
//    GitOwner findByGitId(Long gitId);
    GitOwner save(GitOwner gitOwner);
}
