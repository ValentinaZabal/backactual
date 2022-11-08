package com.example.demo.services;

import com.example.demo.models.ElectricistaModel;
import com.example.demo.repositories.ElectricistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ElectricistaService {

    @Autowired
    ElectricistaRepository electricistaRepository;

    public ArrayList<ElectricistaModel> obtenerElectricistas (){ return (ArrayList< ElectricistaModel>) electricistaRepository.findAll();}

    public ElectricistaModel guardarElectricista (ElectricistaModel electricista) {return electricistaRepository.save(electricista);}


}
