package br.com.casi.eleicao.service;

import br.com.casi.eleicao.entity.Historico;
import br.com.casi.eleicao.repository.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoService {
    @Autowired
    HistoricoRepository historicoRepository;

    public Historico create(Historico historico) {
        return historicoRepository.save(historico);
    }

    public List<Historico> findAll() {
        return historicoRepository.findAll();
    }

    // Outros métodos de serviço relacionados a Historico, se necessário
}