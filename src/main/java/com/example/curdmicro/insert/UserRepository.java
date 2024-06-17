package com.example.curdmicro.insert;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curdmicro.User;

public interface UserRepository extends JpaRepository<User, Long> {}
