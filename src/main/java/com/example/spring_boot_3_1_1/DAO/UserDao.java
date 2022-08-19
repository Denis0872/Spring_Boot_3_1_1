package com.example.spring_boot_3_1_1.DAO;

import com.example.spring_boot_3_1_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao  {
    List<User> getAllUsers ();
    User getUserById(int id);
    void addUser(User user);
    void removeUser(int id);

    void updateUser(User user);
}
