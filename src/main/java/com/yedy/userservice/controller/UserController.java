package com.yedy.userservice.controller;

import com.yedy.userservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("test")
    public User test(){
        User user = new User();
        user.setAd("yusuf");
        user.setSoyad("demircan");
        return user;
    }
}
