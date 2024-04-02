package com.example.cRuD.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<Filme> filmes;

    public void setId(Long id) {
    }
}
