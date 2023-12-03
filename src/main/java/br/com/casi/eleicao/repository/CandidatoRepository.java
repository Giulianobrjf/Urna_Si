package br.com.casi.eleicao.repository;

import br.com.casi.eleicao.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {


}
