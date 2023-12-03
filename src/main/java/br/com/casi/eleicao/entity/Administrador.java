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
public class Administrador extends Pessoa{

    public Administrador(String nome,String vinculo,String celular, String email, Cargo cargo) {
        super(nome, vinculo, celular, email);
    }
}