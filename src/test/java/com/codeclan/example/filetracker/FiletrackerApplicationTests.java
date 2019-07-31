package com.codeclan.example.filetracker;

import com.codeclan.example.filetracker.models.File;
import com.codeclan.example.filetracker.models.Folder;
import com.codeclan.example.filetracker.models.User;
import com.codeclan.example.filetracker.repository.FileRepository;
import com.codeclan.example.filetracker.repository.FolderRepository;
import com.codeclan.example.filetracker.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FiletrackerApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

    @Test
    public void createFolder(){

		User user = new User ("John");
	    userRepository.save(user);

		Folder folder = new Folder("Week_13", user);
		folderRepository.save(folder);
    }


    @Test
	public void createFile(){

		File file = new File("");
		fileRepository.save(file);

		Folder folder = new Folder("Week_13");
		folderRepository.save(folder);



	}

}
