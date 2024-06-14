package Practica.repositories;

import Practica.entities.DummyEntity;
import Practica.models.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepositoy extends JpaRepository<DummyEntity, Long> {
}
