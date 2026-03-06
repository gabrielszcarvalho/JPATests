package com.bn.milagre2.models;


import jakarta.persistence.*;


@Entity
public class MilagreModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String endereco;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
