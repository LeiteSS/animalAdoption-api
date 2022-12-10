package io.github.leitess.animaladoption.model.service.implementation;

import io.github.leitess.animaladoption.model.entity.Users;
import io.github.leitess.animaladoption.model.repository.UsersRepository;
import io.github.leitess.animaladoption.model.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository repository;

    @Override
    public Users profile(String email, String password) {
        return repository.findUserByEmailAndPassword(email, password);
    }

    @Override
    public Optional<Users> signUp(Users users) {
        return Optional.of(repository.save(users));
    }

    @Override
    public Users signIn(String email, String password) {
        return repository.findUserByEmailAndPassword(email, password);
    }
}
