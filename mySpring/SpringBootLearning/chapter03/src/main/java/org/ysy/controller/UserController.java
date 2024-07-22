package org.ysy.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ysy.entity.User;
import org.ysy.service.UserService;

@RestController
@RequestMapping("/user")
@Tag(name = "用户信息管理")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("getById")
    @Operation(summary = "根据id查询用户信息")
    public User getById(@Parameter(description = "用户id") @RequestParam Integer id){
        User user = new User("", 0);

        user.setId(id);
        user.setAge(18);
        user.setName("zhangsan");

        return user;
    }

    @PostMapping("create")
    public int create(@RequestBody User user){
        return service.create(user.getName(), user.getAge());
    }
}
