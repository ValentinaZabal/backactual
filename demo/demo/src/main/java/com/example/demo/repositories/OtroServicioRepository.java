package com.example.demo.repositories;

import com.example.demo.models.OtroServicioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtroServicioRepository extends CrudRepository<OtroServicioModel, Long> {
}
