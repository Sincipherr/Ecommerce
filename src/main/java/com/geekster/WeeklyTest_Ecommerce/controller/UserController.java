package com.geekster.WeeklyTest_Ecommerce.controller;

import com.geekster.WeeklyTest_Ecommerce.model.User;
import com.geekster.WeeklyTest_Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService us;

    @PostMapping(value = "/createUsers")
    public void addUsers(@RequestBody User user){
        us.addUsers(user);
    }

    @GetMapping(value = "/getByUserId/{userId}")
    public List<User> getUserById(@PathVariable Integer userId){
        return us.getUserById(userId);
    }

}
