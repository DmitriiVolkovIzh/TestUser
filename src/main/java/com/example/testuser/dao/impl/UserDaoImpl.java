package com.example.testuser.dao.impl;

import com.example.testuser.dao.UserDao;
import com.example.testuser.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    private final List<User> users;

    public UserDaoImpl() {
        users = new ArrayList<>();
        users.add(new User("Dima"));
        users.add(new User("Ira"));
        users.add(new User("Lida"));
    }


    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;

            }

        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

}
