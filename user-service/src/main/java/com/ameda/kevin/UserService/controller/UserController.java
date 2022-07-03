package com.ameda.kevin.UserService.controller;

import com.ameda.kevin.UserService.entity.UserEntity;
import com.ameda.kevin.UserService.service.UserService;
import com.ameda.kevin.UserService.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserEntity saveUser(@RequestBody UserEntity user){
        return userService.saveUser(user);
    }
    @GetMapping("/{userId}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("userId") Long userId){
        return  userService.getUserWithDepartment(userId);
    }
}
