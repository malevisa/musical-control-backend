package com.musical.control.applicationws.controller;

import com.musical.control.applicationws.controller.dto.UserRequestDTO;
import com.musical.control.applicationws.entitys.User;
import com.musical.control.applicationws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public ResponseEntity createUser(@RequestBody UserRequestDTO user) {
        try {
            userRepository.save(
                new User(
                        user.getUsername(),
                        user.getEmail(),
                        user.getPassword()
                )
            );

            return ResponseEntity.status(201).build();
        } catch (IllegalArgumentException e) {
            throw  e;
        }
    }

}
