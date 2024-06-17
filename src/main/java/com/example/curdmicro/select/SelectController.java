package com.example.curdmicro.select;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.curdmicro.User;
import com.example.curdmicro.insert.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/select")
public class SelectController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
