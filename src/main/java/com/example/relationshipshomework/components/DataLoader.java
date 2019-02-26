package com.example.relationshipshomework.components;

import com.example.relationshipshomework.models.File;
import com.example.relationshipshomework.models.Folder;
import com.example.relationshipshomework.models.User;
import com.example.relationshipshomework.repositories.FileRepository;
import com.example.relationshipshomework.repositories.FolderRepository;
import com.example.relationshipshomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Dave");
        userRepository.save(user1);

        User user2 = new User("David");
        userRepository.save(user2);

        Folder folder1 = new Folder("Project", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("App", user2);
        folderRepository.save(folder2);

        File file1 = new File("Doc", "txt", 100, folder1);
        fileRepository.save(file1);

        File file2 = new File("Image", "img", 500, folder2);
        fileRepository.save(file2);

    }

}
