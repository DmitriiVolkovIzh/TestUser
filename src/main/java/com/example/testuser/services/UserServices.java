package com.example.testuser.services;

import com.example.testuser.dao.UserDao;
import com.example.testuser.model.User;

public class UserServices {
    private final UserDao userDao;

    public UserServices(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        return userDao.findAllUsers().contains(user);
    }
}

