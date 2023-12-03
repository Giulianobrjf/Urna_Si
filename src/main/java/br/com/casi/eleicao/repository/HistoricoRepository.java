package br.com.casi.eleicao.repository;


import br.com.casi.eleicao.entity.Historico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<Historico, Long> {
}
