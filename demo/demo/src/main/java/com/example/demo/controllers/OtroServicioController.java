package com.example.demo.controllers;

import com.example.demo.models.OtroServicioModel;
import com.example.demo.services.OtroServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/otroServicio")
public class OtroServicioController {
    @Autowired
    OtroServicioService otroServicioService;

    @GetMapping()
    public ArrayList<OtroServicioModel> obtenerOtrosServicios(){return otroServicioService.obtenerOtrosServicios();}

    @PostMapping
    public OtroServicioModel guardarOtroServicio(@RequestBody OtroServicioModel otroServicio){
        return this.otroServicioService.guardarOtroServicio(otroServicio);

    }


}
