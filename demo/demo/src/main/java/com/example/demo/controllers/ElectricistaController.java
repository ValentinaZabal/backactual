package com.example.demo.controllers;

import com.example.demo.models.ElectricistaModel;
import com.example.demo.services.ElectricistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/electricista")
public class ElectricistaController {
    @Autowired
    ElectricistaService electricistaService;

    @GetMapping()
    public ArrayList<ElectricistaModel> obtenerElectricistas(){return electricistaService.obtenerElectricistas();}

    @PostMapping
    public ElectricistaModel guardarElectricista(@RequestBody ElectricistaModel electricista){
        return this.electricistaService.guardarElectricista(electricista);

    }


}
