package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ProgrammingModel;
import com.example.demo.repositories.ProgrammingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgrammingService {
    @Autowired
    ProgrammingRepository programaRepository;
    
    public ArrayList<ProgrammingModel> obtenerPrograma(){
        return (ArrayList<ProgrammingModel>) programaRepository.findAll();
    }

    public ProgrammingModel guardarPrograma(ProgrammingModel programa){
        return programaRepository.save(programa);
    }

    public Optional<ProgrammingModel> obtenerPorId(Long id){
        return programaRepository.findById(id);
    }


    public ArrayList<ProgrammingModel>  obtenerPorCanal(Integer canal) {
        return programaRepository.findByCanal(canal);
    }

    public boolean eliminarPrograma(Long id) {
        try{
            programaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}