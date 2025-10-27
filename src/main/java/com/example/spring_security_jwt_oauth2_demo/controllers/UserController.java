package com.example.spring_security_jwt_oauth2_demo.controllers;

import com.example.spring_security_jwt_oauth2_demo.dto.UserDTO;
import com.example.spring_security_jwt_oauth2_demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação responsável por processar requisições HTTP
@RequestMapping(value = "/users") // Anotação que mapeia usuários para o controlador
public class UserController {

    @Autowired
    private UserService userService;

    // @RequestBody - anotação que mapeia o corpo da requisição
    @PostMapping // Anotação que vai mapear a requisição para criar um usuário
    private UserDTO insert(@RequestBody UserDTO dto) {
        return userService.insert(dto);
    }
}
