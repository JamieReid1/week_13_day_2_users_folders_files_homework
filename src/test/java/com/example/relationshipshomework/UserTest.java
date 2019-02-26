package com.example.relationshipshomework;

import com.example.relationshipshomework.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    User user;

    @Before
    public void before(){

        user = new User("Dave");

    }

    @Test
    public void hasName(){
        assertEquals("Dave", user.getName());
    }

    @Test
    public void canSetName(){
        user.setName("David");
        assertEquals("David", user.getName());
    }

}
