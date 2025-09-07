package com.project.eventManagement.Controller;


import com.project.eventManagement.Model.User;
import com.project.eventManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }


    @PutMapping("/api/users")
    public User updateUser(@RequestBody User user){

    
        return service.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }




}
    

