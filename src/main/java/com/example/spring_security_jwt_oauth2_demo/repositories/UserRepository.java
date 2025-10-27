package com.example.spring_security_jwt_oauth2_demo.repositories;

import com.example.spring_security_jwt_oauth2_demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
