package io.github.leitess.animaladoption.model.service;

import io.github.leitess.animaladoption.model.entity.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalsService {

    Optional<Animal> saveAnimal(Animal animal);
    Optional<Animal> updateAnimal(Animal animal, Long id);
    void deleteAnimal(Long id);
    List<Animal> listAnimals();
}
