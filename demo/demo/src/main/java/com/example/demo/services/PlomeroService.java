package com.example.demo.services;

import com.example.demo.models.PlomeroModel;
import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.PlomeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlomeroService {

    @Autowired
    PlomeroRepository plomeroRepository;

    public ArrayList<PlomeroModel> obtenerPlomeros (){ return (ArrayList< PlomeroModel>) plomeroRepository.findAll();}

    public PlomeroModel guardarPlomero (PlomeroModel plomero) {return plomeroRepository.save(plomero);}


}
