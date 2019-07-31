package com.codeclan.example.filetracker.projections;

import com.codeclan.example.filetracker.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedAllForFiles", types = File.class)
public interface EmbedAllForFiles {
    String getName();
    String getExtension();
    int getSize();
    String getFolder();
}
