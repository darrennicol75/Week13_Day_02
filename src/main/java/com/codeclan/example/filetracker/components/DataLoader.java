package com.codeclan.example.filetracker.components;


import com.codeclan.example.filetracker.models.File;
import com.codeclan.example.filetracker.models.Folder;
import com.codeclan.example.filetracker.models.User;
import com.codeclan.example.filetracker.repository.FileRepository;
import com.codeclan.example.filetracker.repository.FolderRepository;
import com.codeclan.example.filetracker.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    //Seed File

    public void run(ApplicationArguments args){

        User user = new User("John");
        userRepository.save(user);

        Folder folder = new Folder("Week_13", user)

    }
}
