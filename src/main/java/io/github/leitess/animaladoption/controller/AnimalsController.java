package io.github.leitess.animaladoption.controller;

import io.github.leitess.animaladoption.model.entity.Animal;
import io.github.leitess.animaladoption.model.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/animals")
public class AnimalsController {

    @Autowired
    private AnimalsService service;

    @GetMapping("/")
    public ResponseEntity<List<Animal>> listAll() {
        return ResponseEntity.ok(service.listAnimals());
    }

    @PostMapping("/")
    public ResponseEntity<Optional<Animal>> createAnimal(@RequestBody Animal animal) {
        return ResponseEntity.ok(service.saveAnimal(animal));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<Animal>> updateAnimal(@RequestBody Animal animal, @PathVariable("id") Long id) {
        return ResponseEntity.ok(service.updateAnimal(animal, id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAnimal(@PathVariable("id") Long id) {
        service.deleteAnimal(id);
    }
}
