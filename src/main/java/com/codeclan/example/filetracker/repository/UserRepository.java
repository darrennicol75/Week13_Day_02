package com.codeclan.example.filetracker.repository;

import com.codeclan.example.filetracker.projections.EmbedFoldersForUsers;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFoldersForUsers.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
