package com.example.demo.repositories;

import com.example.demo.models.ElectricistaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricistaRepository extends CrudRepository<ElectricistaModel, Long> {
}
