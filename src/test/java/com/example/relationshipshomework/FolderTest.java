package com.example.relationshipshomework;

import com.example.relationshipshomework.models.Folder;
import com.example.relationshipshomework.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FolderTest {

    Folder folder;

    @Before
    public void before(){

        folder =  new Folder("Project");

    }

    @Test
    public void hasTitle(){
        assertEquals("Project", folder.getTitle());
    }

}
