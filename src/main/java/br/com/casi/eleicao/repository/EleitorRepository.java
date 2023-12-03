package br.com.casi.eleicao.repository;

import br.com.casi.eleicao.entity.Eleitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleitorRepository extends JpaRepository<Eleitor, Long> {
}
