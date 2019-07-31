package com.codeclan.example.filetracker.repository;

import com.codeclan.example.filetracker.models.Folder;
import com.codeclan.example.filetracker.projections.EmbedFilesForFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFilesForFolders.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
