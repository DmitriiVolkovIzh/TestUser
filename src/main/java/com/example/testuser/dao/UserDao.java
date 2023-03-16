package com.example.testuser.dao.impl;

import com.example.testuser.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}
