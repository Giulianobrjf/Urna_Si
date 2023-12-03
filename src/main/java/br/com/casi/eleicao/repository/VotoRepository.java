package br.com.casi.eleicao.repository;


import br.com.casi.eleicao.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<Voto, Long> {
}
