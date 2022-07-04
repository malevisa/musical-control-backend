package com.musical.control.applicationws.service.impl;

import com.musical.control.applicationws.controller.dto.UserRequestDTO;
import com.musical.control.applicationws.controller.dto.UserResponseDTO;
import com.musical.control.applicationws.entitys.User;
import com.musical.control.applicationws.exceptions.NotFoundException;
import com.musical.control.applicationws.repository.UserRepository;
import com.musical.control.applicationws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDTO createUser(UserRequestDTO user) {

        User newUser = userRepository.save(
                new User(
                        user.getUsername(),
                        user.getEmail(),
                        user.getPassword()
                )
        );

        return new UserResponseDTO(
                newUser.getUsername(),
                newUser.getEmail()
        );

    }

    @Override
    public String updateUser(UserRequestDTO user) {
        Optional<User> foundUser = userRepository.findById(user.getIdUser());

        if (foundUser.isPresent()) {
            User u = foundUser.get();

            u.setUsername(user.getUsername());
            u.setEmail(user.getEmail());
            u.setPassword(user.getPassword());

            userRepository.save(u);

            return "Usuário atualizado com sucesso";

        }

        throw new NotFoundException("Usuário inválido ou não encontrado.");

    }
}
