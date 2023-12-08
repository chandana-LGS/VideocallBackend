package com.example.GatherHubProject.Controller;

import com.example.GatherHubProject.Entity.User;
import com.example.GatherHubProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> listAll(){
        return userService.listAll();

    }
    @PostMapping("/adduser")
    public String addUser(@RequestBody User user){
        User user1=userService.addUser(user);
        return "Registration Success";
    }
}
