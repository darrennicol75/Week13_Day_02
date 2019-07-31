package com.codeclan.example.filetracker.repository;

import com.codeclan.example.filetracker.models.File;

import com.codeclan.example.filetracker.projections.EmbedAllForFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedAllForFiles.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
