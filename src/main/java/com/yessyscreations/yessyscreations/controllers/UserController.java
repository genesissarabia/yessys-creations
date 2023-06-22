package com.yessyscreations.yessyscreations.controllers;

import com.yessyscreations.yessyscreations.repositories.CraftRepository;
import com.yessyscreations.yessyscreations.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserRepository userDao;
    private CraftRepository craftDao;

    public UserController(UserRepository userDao, CraftRepository craftDao){
        this.userDao = userDao;
        this.craftDao = craftDao;
    }

    @GetMapping("/")
    public String homePage(){
        return "index";
    }




}
