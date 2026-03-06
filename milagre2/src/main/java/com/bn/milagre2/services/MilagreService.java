package com.bn.milagre2.services;

import com.bn.milagre2.models.MilagreModel;
import com.bn.milagre2.repositories.MilagreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilagreService {

    //injeta dependências
    @Autowired
    private MilagreRepository milagreRepository;

    //vamo sempre chama o model nos métodos (nome deles) e dentro dos métodos o repository

    public List<MilagreModel> findAll(){
        return milagreRepository.findAll();
    }

    public MilagreModel criar(MilagreModel milagreModel){
        return milagreRepository.save(milagreModel);
    }

    public void deletar (Long id){
        milagreRepository.deleteById(id);
    }

    public MilagreModel atualizar(Long id, MilagreModel milagreModel){
        MilagreModel novo = milagreRepository.findById(id).get();
        novo.setNome(milagreModel.getNome());
        novo.setEndereco(milagreModel.getEndereco());
        return milagreRepository.save(novo);

    }

}
