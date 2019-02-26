package com.example.relationshipshomework;

import com.example.relationshipshomework.models.File;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileTest {

    File file;

    @Before
    public void before(){

        file = new File("Doc", "txt", 200);

    }

    @Test
    public void hasName(){
        assertEquals("Doc", file.getName());
    }

    @Test
    public void canSetName(){
        file.setName("Image");
        assertEquals("Image", file.getName());
    }

    @Test
    public void hasExtension(){
        assertEquals("txt", file.getExtension());
    }

    @Test
    public void canSetExtension(){
        file.setExtension("img");
        assertEquals("img", file.getExtension());
    }

    @Test
    public void hasSize(){
        assertEquals(200, file.getSize());
    }

    @Test
    public void canSetSize(){
        file.setSize(100);
        assertEquals(100, file.getSize());
    }

}
