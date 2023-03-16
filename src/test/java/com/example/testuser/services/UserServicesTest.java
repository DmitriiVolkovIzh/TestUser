package com.example.testuser.services;

import com.example.testuser.dao.UserDao;
import com.example.testuser.model.User;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class UserServicesTest {
    @Mock
    private UserDao userDao;


    @InjectMocks
    private UserServices userServices = new UserServices(userDao);

    @Test
    public void checkUserNoExist() {
        User user = new User("Dima");
        boolean result = userServices.checkUserExist(user);
        assertFalse(result);
    }

    @Test
    public void checkUserExist() {
        User user = new User("Dima");
        List<User> userList = new ArrayList<>();
        userList.add(user);
        when(userDao.findAllUsers()).thenReturn(userList);
        boolean result = userServices.checkUserExist(user);
        assertTrue(result);

    }
}
