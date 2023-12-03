package br.com.casi.eleicao.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Relatorio {

    private LocalDate data;
    public void gerarRelatorioFinal(){

    }
    public void mostrarGrafico(){

    }
}
