package com.example.curdmicro.delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.curdmicro.insert.UserRepository;

@RestController
@RequestMapping("/delete")
public class DeleteController {
	@Autowired
	private UserRepository userRepository;
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}

}
