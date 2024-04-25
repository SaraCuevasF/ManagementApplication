package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.ProgrammingModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingRepository extends CrudRepository<ProgrammingModel, Long> {
    public abstract ArrayList<ProgrammingModel> findByCanal(Integer canal);

}
