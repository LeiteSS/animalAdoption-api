package io.github.leitess.animaladoption.model.service.implementation;

import io.github.leitess.animaladoption.model.entity.Animal;
import io.github.leitess.animaladoption.model.repository.AnimalsRepository;
import io.github.leitess.animaladoption.model.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    @Autowired
    private AnimalsRepository repository;

    @Override
    public Optional<Animal> saveAnimal(Animal animal) {
        return Optional.of(repository.save(animal));
    }

    @Override
    public Optional<Animal> updateAnimal(Animal animal, Long id) {

        animal.setId(id);

        return Optional.of(repository.save(animal));
    }

    @Override
    public void deleteAnimal(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Animal> listAnimals() {
        return repository.findAll();
    }
}
