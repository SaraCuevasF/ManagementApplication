package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ProgrammingModel;
import com.example.demo.services.ProgrammingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/programacion")
public class ProgrammingController {
    @Autowired
    ProgrammingService programaService;

    @GetMapping()
    public ArrayList<ProgrammingModel> obtenerPrograma(){
        return programaService.obtenerPrograma();
    }

    @PostMapping()
    public ProgrammingModel guardarPrograma(@RequestBody ProgrammingModel programa){
        return this.programaService.guardarPrograma(programa);
    }

    @GetMapping( path = "/{id}")
    public Optional<ProgrammingModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.programaService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<ProgrammingModel> obtenerProgramaPorCanal(@RequestParam("canal") Integer canal){
        return this.programaService.obtenerPorCanal(canal);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.programaService.eliminarPrograma(id);
        if (ok){
            return "Se eliminó el programa con id " + id;
        }else{
            return "No pudo eliminar el programa con id" + id;
        }
    }

}
