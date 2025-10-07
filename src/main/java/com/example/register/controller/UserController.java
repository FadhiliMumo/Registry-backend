package com.example.register.controller;

import com.example.register.repository.UserRepository;
import com.example.register.model.User;
import jakarta.persistence.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Entity
public class UserController {
    private UserRepository userRepo;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody UserDto userDto){
        User user=new User();
        user.setName(userDto.getName());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setDate(String.valueOf(LocalDateTime.now()));
        return ResponseEntity.ok(userRepo.save(user));
    }
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
       return ResponseEntity.ok(userRepo.findAll());
    }
    @GetMapping("[/id]")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userRepo.findById(id));
    }

}
