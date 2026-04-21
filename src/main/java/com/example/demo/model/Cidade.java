package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String nivelSustentabilidade;
    private Double emissaoCO2;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getNivelSustentabilidade() { return nivelSustentabilidade; }
    public void setNivelSustentabilidade(String nivelSustentabilidade) { this.nivelSustentabilidade = nivelSustentabilidade; }

    public Double getEmissaoCO2() { return emissaoCO2; }
    public void setEmissaoCO2(Double emissaoCO2) { this.emissaoCO2 = emissaoCO2; }
}
