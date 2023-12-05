package br.com.casi.eleicao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
