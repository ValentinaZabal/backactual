package com.example.demo.services;

import com.example.demo.models.OtroServicioModel;
import com.example.demo.repositories.OtroServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OtroServicioService {

    @Autowired
    OtroServicioRepository otroServicioRepository;

    public ArrayList<OtroServicioModel> obtenerOtrosServicios (){ return (ArrayList< OtroServicioModel>) otroServicioRepository.findAll();}

    public OtroServicioModel guardarOtroServicio (OtroServicioModel plomero) {return otroServicioRepository.save(plomero);}


}
