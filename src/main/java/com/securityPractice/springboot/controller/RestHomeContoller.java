package com.securityPractice.springboot.controller;

import com.securityPractice.springboot.dto.UserDto;
import com.securityPractice.springboot.model.User;
import com.securityPractice.springboot.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestHomeContoller {

    @Autowired
    private UserService userService;
    @GetMapping("/rest-page")
    public String homePage(){
        return "home-page";
    }

    @PostMapping("/signup-user")
    public void setUser(@RequestBody UserDto userDto){
        userService.setUser(userDto);

    }

    @GetMapping("/show-user")
    public List<User> signupUser(){
        return userService.getUsers();
    }

    @GetMapping("/start-page")
    public String startPage(){
        return "this is my start page";
    }


}
