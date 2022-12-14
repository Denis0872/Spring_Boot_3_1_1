package com.example.spring_boot_3_1_1.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.example.spring_boot_3_1_1.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getAllUsers() {
        return entityManager.createQuery("select s from User s", User.class).getResultList();
        //return entityManager.createNativeQuery("SELECT * FROM users", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class,id);
    }


    @Override
    @Transactional
    public void updateUser(User user) {

        entityManager.merge(user);
        entityManager.flush();
    }
    @Override
    public void removeUser(int id) {
        entityManager.remove(getUserById(id));
    }

}
