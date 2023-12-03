package br.com.casi.eleicao.service;

import br.com.casi.eleicao.entity.Relatorio;
import br.com.casi.eleicao.repository.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioService {
    @Autowired
    RelatorioRepository relatorioRepository;

    public Relatorio create(Relatorio relatorio) {
        return relatorioRepository.save(relatorio);
    }

    public List<Relatorio> findAll() {
        return relatorioRepository.findAll();
    }

    // Outros métodos de serviço relacionados a Relatorio, se necessário
}
