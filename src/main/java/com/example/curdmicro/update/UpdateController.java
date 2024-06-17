package com.example.curdmicro.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curdmicro.User;
import com.example.curdmicro.insert.UserRepository;

@RestController
@RequestMapping("/update")
public class UpdateController {

	@Autowired
	private UserRepository userRepository;
	
	@PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
    	user.setId(id);
    	return userRepository.save(user);
    }
}
