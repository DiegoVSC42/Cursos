package com.diego.projeto.consulta_fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculo(
        @JsonAlias("Valor") String valor,
        @JsonAlias("Marca")String marca,
        @JsonAlias("Modelo")String modelo,
        @JsonAlias("AnoModelo")String anoModelo,
        @JsonAlias("Combustivel")String combustivel) {
}
