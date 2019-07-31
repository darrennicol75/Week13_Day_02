package com.codeclan.example.filetracker.projections;


import com.codeclan.example.filetracker.models.Folder;
import com.codeclan.example.filetracker.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFoldersForUsers", types = User.class)
public interface EmbedFoldersForUsers {
    String getUserName();
    List<Folder> getFolders();
}
