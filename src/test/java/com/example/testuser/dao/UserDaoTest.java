package com.example.testuser.dao;

import com.example.testuser.dao.impl.UserDaoImpl;
import com.example.testuser.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    private final UserDao userDao = new UserDaoImpl();


    @Test
    public void testGetUserByName_success() {
        String name = "Dima";
        User user = userDao.getUserByName(name);
        Assertions.assertNotNull(user);
        Assertions.assertEquals(name, user.getName());
    }

    @Test
    public void testGetUserByName_fail() {
        String name = "Kate";
        User user = userDao.getUserByName(name);
        Assertions.assertNull(user);
    }
}
