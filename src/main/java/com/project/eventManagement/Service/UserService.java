package com.project.eventManagement.Service;


import com.project.eventManagement.Model.User;
import com.project.eventManagement.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }

    public User updateUser ( User user) {
        return repo.save(user);
    }

    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
