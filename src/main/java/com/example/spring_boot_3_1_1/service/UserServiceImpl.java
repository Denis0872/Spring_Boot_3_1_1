package com.example.spring_boot_3_1_1.service;

import com.example.spring_boot_3_1_1.dao.UserDao;
import com.example.spring_boot_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    @Override
    public Object getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }


    @Override
    public void removeUser(int id) {
        userDao.removeUser( id);
    }

    @Override
    public void updateUser( User user) {
        userDao.updateUser(user);
    }
}
