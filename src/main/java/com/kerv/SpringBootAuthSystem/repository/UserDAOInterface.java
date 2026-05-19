package com.kerv.SpringBootAuthSystem.repository;

import com.kerv.SpringBootAuthSystem.model.User;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDAOInterface extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
