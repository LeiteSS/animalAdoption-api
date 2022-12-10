package io.github.leitess.animaladoption.model.service;

import io.github.leitess.animaladoption.model.entity.Users;

import java.util.Optional;

public interface UsersService {

    Users profile(String email, String password);
    Optional<Users> signUp(Users users);
    Users signIn(String email, String password);
}
