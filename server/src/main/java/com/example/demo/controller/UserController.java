package com.example.demo.controller;

import java.util.Collection;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    private UserRepository repo;

    public UserController(UserRepository repo){
        this.repo = repo;
    }

    @GetMapping("/user")
    public Collection<User> user(){
        return repo.findAll();
    }
}