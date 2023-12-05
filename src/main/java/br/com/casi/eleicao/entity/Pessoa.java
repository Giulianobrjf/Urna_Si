package br.com.casi.eleicao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
   private String nome;
   private String vinculo;
   private String celular;
   private String email;

    public Pessoa(String nome, String vinculo, String celular, String email) {
        this.nome = nome;
        this.vinculo = vinculo;
        this.celular = celular;
        this.email = email;
    }
}
