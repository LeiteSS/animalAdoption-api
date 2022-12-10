package io.github.leitess.animaladoption.controller;

import io.github.leitess.animaladoption.model.entity.Users;
import io.github.leitess.animaladoption.model.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UsersService service;

    @PostMapping("/")
    public ResponseEntity<Optional<Users>> signUp(@RequestBody Users users) {
        return ResponseEntity.ok(service.signUp(users));
    }

    @GetMapping("/me/{email}/{password}")
    public ResponseEntity<Users> me(@PathVariable("email") String email, @PathVariable("password") String password) {
        return ResponseEntity.ok(service.profile(email, password));
    }

    @GetMapping("/signIn/{email}/{password}")
    public ResponseEntity<Users> signIn(@PathVariable("email") String email, @PathVariable("password") String password) {
        return ResponseEntity.ok(service.signIn(email, password));
    }
}
