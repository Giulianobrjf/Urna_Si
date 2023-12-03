package br.com.casi.eleicao.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    Long id;
    String nome;
    String vinculo;
    String celular;
    String email;

    public Pessoa(String nome, String vinculo, String celular, String email) {
        this.nome = nome;
        this.vinculo = vinculo;
        this.celular = celular;
        this.email = email;
    }
}
