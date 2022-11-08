package com.example.demo.controllers;

import com.example.demo.models.PlomeroModel;
import com.example.demo.services.PlomeroService;
import com.example.demo.services.PlomeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/plomero")
public class PlomeroController {
    @Autowired
    PlomeroService plomeroService;

    @GetMapping()
    public ArrayList<PlomeroModel> obtenerPlomeros(){return plomeroService.obtenerPlomeros();}

    @PostMapping
    public PlomeroModel guardarPlomero(@RequestBody PlomeroModel plomero){
        return this.plomeroService.guardarPlomero(plomero);

    }


}
