package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class EstudanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "email_aluno")
    String email;
    Integer idade;
    @Column(name = "nome_aluno")
    String nome;


    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstudanteModel() {
    }
}
