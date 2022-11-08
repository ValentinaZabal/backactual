package com.example.demo.services;

import com.example.demo.models.GasistaModel;
import com.example.demo.repositories.GasistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GasistaService {

    @Autowired
    GasistaRepository gasistaRepository;

    public ArrayList<GasistaModel> obtenerGasistas (){ return (ArrayList< GasistaModel>) gasistaRepository.findAll();}

    public GasistaModel guardarGasista (GasistaModel gasista) {return gasistaRepository.save(gasista);}


}
