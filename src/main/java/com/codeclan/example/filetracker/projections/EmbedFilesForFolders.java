package com.codeclan.example.filetracker.projections;

import com.codeclan.example.filetracker.models.File;
import com.codeclan.example.filetracker.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedFilesForFolders", types = Folder.class)
public interface EmbedFilesForFolders {
    String getTitle();
    String getUser();
    ArrayList<File> getFiles();
}
