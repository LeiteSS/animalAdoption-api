package io.github.leitess.animaladoption.model.repository;

import io.github.leitess.animaladoption.model.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalsRepository extends JpaRepository<Animal, Long> {
}
