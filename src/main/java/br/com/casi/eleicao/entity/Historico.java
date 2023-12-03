package br.com.casi.eleicao.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor

public class Historico extends ChapaVencedora {
    private List<Void> chapasAnteriores;

    public Historico() {
        this.chapasAnteriores = new ArrayList<>();
    }

    public void adicionarChapa() {
        chapasAnteriores.add(null);
    }

    public void gerarHistorico() {

    }
}
