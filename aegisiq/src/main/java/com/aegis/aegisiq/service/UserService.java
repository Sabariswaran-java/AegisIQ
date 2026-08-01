package com.aegis.aegisiq.service;

import java.util.List;
import java.util.Optional;

import com.aegis.aegisiq.entity.User;

public interface UserService {

    User registerUser(User user);

    Optional<User> getUserByEmail(String email);

    List<User> getAllUsers();

}