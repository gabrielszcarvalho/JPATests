package com.example.demo.repository;

import com.example.demo.model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {

    List<EstudanteModel> findByNome(String nome);

}
