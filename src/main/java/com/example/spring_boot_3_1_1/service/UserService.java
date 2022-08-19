package com.example.spring_boot_3_1_1.service;

import com.example.spring_boot_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers ();

    void addUser(User user);

    void removeUser(int id);

    void updateUser(User user);
    Object getUserById(int id);
}
