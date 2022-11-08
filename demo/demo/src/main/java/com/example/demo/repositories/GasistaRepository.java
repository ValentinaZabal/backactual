package com.example.demo.repositories;

import com.example.demo.models.GasistaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GasistaRepository extends CrudRepository<GasistaModel, Long> {
}
