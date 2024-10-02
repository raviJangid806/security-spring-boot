package com.securityPractice.springboot.controller;

import com.securityPractice.springboot.dto.UserDto;
import com.securityPractice.springboot.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String FirstPage(){
        return "index";
    }


}
