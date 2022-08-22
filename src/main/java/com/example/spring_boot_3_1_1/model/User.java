package com.example.spring_boot_3_1_1.model;

import lombok.Data;

import javax.persistence.*;

    @Data
    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "name")
        private String name;

        @Column(name = "surname")
        private String surname;

        @Column(name = "age")
        private int age;

        @Column(name = "email")
        private String email;

        public User() {
        }



        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
