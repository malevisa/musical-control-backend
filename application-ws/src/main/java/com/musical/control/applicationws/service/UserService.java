package com.musical.control.applicationws.service;

import com.musical.control.applicationws.controller.dto.UserRequestDTO;
import com.musical.control.applicationws.controller.dto.UserResponseDTO;

public interface UserService {

    UserResponseDTO createUser(UserRequestDTO user);

    String updateUser(UserRequestDTO user);
}
