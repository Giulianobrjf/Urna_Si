package br.com.casi.eleicao.service;
import br.com.casi.eleicao.entity.ChapaVencedora;
import br.com.casi.eleicao.repository.ChapaVencedoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapaVencedoraService {
    @Autowired
    ChapaVencedoraRepository chapaVencedoraRepository;

    public ChapaVencedora create(ChapaVencedora chapaVencedora) {
        return chapaVencedoraRepository.save(chapaVencedora);
    }

    public List<ChapaVencedora> findAll() {
        return chapaVencedoraRepository.findAll();
    }

    // Outros métodos de serviço relacionados a ChapaVencedora, se necessário
}