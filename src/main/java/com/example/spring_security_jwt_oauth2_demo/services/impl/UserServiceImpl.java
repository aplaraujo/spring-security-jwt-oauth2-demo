package com.example.spring_security_jwt_oauth2_demo.services.impl;

import com.example.spring_security_jwt_oauth2_demo.dto.UserDTO;
import com.example.spring_security_jwt_oauth2_demo.entities.User;
import com.example.spring_security_jwt_oauth2_demo.repositories.UserRepository;
import com.example.spring_security_jwt_oauth2_demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Classe que será responsável por regras de negócio do projeto
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO insert(UserDTO dto) {
        User existingUser = userRepository.findByLogin(dto.login());
        if (existingUser != null) {
            throw new RuntimeException("Esse usuário já existe!");
        }

        User entity = new User();
        copyDtoToEntity(dto, entity);
        entity = userRepository.save(entity);
        return new UserDTO(entity.getName(), entity.getLogin(), entity.getPassword());
    }

    private void copyDtoToEntity(UserDTO dto, User entity) {
        entity.setName(dto.name());
        entity.setLogin(dto.login());
        entity.setPassword(dto.password());
    }
}
