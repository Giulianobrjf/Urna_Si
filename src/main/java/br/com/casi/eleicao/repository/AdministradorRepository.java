package br.com.casi.eleicao.repository;

import br.com.casi.eleicao.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {


}