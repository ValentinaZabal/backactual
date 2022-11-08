package com.example.demo.controllers;

import com.example.demo.models.GasistaModel;
import com.example.demo.services.GasistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/gasista")
public class GasistaController {
    @Autowired
    GasistaService gasistaService;

    @GetMapping()
    public ArrayList<GasistaModel> obtenerGasistas(){return gasistaService.obtenerGasistas();}

    @PostMapping
    public GasistaModel guardarGasista(@RequestBody GasistaModel gasista){
        return this.gasistaService.guardarGasista(gasista);

    }


}
