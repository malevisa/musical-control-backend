package com.musical.control.applicationws.controller;

import com.musical.control.applicationws.controller.dto.UserRequestDTO;
import com.musical.control.applicationws.controller.dto.UserResponseDTO;
import com.musical.control.applicationws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO user) {

        UserResponseDTO userResponse = userService.createUser(user);

        if (userResponse != null) {
            return ResponseEntity.status(201).body(userResponse);
        }

        return ResponseEntity.status(500).build();
    }

    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody UserRequestDTO user) {
        return ResponseEntity.status(200).body(userService.updateUser(user));
    }

}
