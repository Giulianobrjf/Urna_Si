package br.com.casi.eleicao.service;

import br.com.casi.eleicao.entity.Eleitor;
import br.com.casi.eleicao.repository.EleitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleitorService {
    @Autowired
    EleitorRepository eleitorRepository;

    public Eleitor create(Eleitor eleitor) {
        return eleitorRepository.save(eleitor);
    }

    public List<Eleitor> findAll() {
        return eleitorRepository.findAll();
    }

    // Outros métodos de serviço relacionados a Eleitor, se necessário
}
