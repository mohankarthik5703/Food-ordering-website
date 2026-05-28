package com.foodorder.onlinefoodorderingsystem.controller;

import com.foodorder.onlinefoodorderingsystem.model.User;
import com.foodorder.onlinefoodorderingsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(repo.save(user));
    }
}
