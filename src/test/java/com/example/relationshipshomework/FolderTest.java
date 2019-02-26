package com.example.relationshipshomework;

import com.example.relationshipshomework.models.Folder;
import com.example.relationshipshomework.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FolderTest {

    Folder folder;
    User user;

    @Before
    public void before(){

        user = new User("Dave");
        folder =  new Folder("Project", user);

    }

    @Test
    public void hasTitle(){
        assertEquals("Project", folder.getTitle());
    }

}
