package com.example.curdmicro.insert;

import org.springframework.web.bind.annotation.RestController;

import com.example.curdmicro.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insert")
public class InsertController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public User insertuser(@RequestBody User user) {
		return userRepository.save(user);
	}

}
