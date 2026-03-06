package com.bn.milagre2.controllers;


import com.bn.milagre2.models.MilagreModel;
import com.bn.milagre2.services.MilagreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/milagres")
public class MilagreController {

    //se ta no service vai chama o repository, se ta no controller chama o service
    @Autowired
    private MilagreService milagreService;

    @GetMapping
    public List<MilagreModel> findAll(){
        return milagreService.findAll();
    }

    @PostMapping
    public MilagreModel criar(@RequestBody MilagreModel milagreModel){
        return milagreService.criar(milagreModel);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        milagreService.deletar(id);
    }

    @PutMapping("/{id}")
    public MilagreModel atualizar(@PathVariable Long id, @RequestBody MilagreModel milagreModel){
        return milagreService.atualizar(id,milagreModel);

    }


}
