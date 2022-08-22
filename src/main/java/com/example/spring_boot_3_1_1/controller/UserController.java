package com.example.spring_boot_3_1_1.controller;

import com.example.spring_boot_3_1_1.model.User;
import com.example.spring_boot_3_1_1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;


    @GetMapping("/")
    public String users(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }


    @GetMapping("edit/{id}")
    public String updateUserGet(@PathVariable("id") int id, Model model) {
        model.addAttribute(userService.getUserById(id));
        return "edit";
    }


    @PatchMapping("edit")
    public String updateUserPatch( User user){
        this.userService.updateUser(user);
        return "redirect:/";
    }


    @GetMapping("/create")
    public String addUserGet(User user) {
        return "create";
    }

    @PostMapping("/create")
    public String addUserPost(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String removeUser(@PathVariable("id") int id){
        this.userService.removeUser(id);
        return "redirect:/";
    }

}
