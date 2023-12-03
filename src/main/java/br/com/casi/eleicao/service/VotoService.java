package br.com.casi.eleicao.service;

import br.com.casi.eleicao.entity.Voto;
import br.com.casi.eleicao.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotoService {
    @Autowired
    VotoRepository votoRepository;

    public Voto create(Voto voto) {
        return votoRepository.save(voto);
    }

    public List<Voto> findAll() {
        return votoRepository.findAll();
    }

    // Outros métodos de serviço relacionados a Voto, se necessário
}