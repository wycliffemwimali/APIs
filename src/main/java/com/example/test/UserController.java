package com.example.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public Users createUser(@RequestBody Users user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }
}
