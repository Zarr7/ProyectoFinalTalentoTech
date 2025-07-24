package com.techlab.spring.repository;

import com.techlab.spring.model.usuario.Role;
import com.techlab.spring.model.usuario.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String name);
}