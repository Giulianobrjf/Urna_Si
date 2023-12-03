package br.com.casi.eleicao.repository;

import br.com.casi.eleicao.entity.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
}
