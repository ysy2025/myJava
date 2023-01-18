package com.ysy.controller;

import com.ysy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller(value = "controller")
@Controller("controller")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 保存用户信息
     */
    public void saveUser(){
        userService.saveUser();
    }
}
