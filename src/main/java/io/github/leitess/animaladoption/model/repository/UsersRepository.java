package io.github.leitess.animaladoption.model.repository;

import io.github.leitess.animaladoption.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findUserByEmailAndPassword(String email, String password);
}
