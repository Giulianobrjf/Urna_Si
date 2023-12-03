package br.com.casi.eleicao.service;

import br.com.casi.eleicao.entity.Administrador;
import br.com.casi.eleicao.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {
    @Autowired
    AdministradorRepository administradorRepository;

    public Administrador create(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    public List<Administrador> findAll() {
        return administradorRepository.findAll();
    }

    // Outros métodos de serviço relacionados a Administrador, se necessário
}