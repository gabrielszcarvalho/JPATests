package com.example.demo.controller;

import com.example.demo.model.EstudanteModel;
import com.example.demo.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService service;


    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        return service.criarEstudante(estudanteModel);
        
    }

    @GetMapping
    public List<EstudanteModel> buscarTodosEstudantes() {

        return service.buscarTodosEstudantes();
    }


    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        service.deletarEstudante(id);
    }
}