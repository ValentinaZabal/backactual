package com.example.demo.repositories;

import com.example.demo.models.PlomeroModel;
import com.example.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlomeroRepository extends CrudRepository<PlomeroModel, Long> {
}
