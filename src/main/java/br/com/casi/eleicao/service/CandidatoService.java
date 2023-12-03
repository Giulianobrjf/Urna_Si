package br.com.casi.eleicao.service;

import br.com.casi.eleicao.entity.Candidato;
import br.com.casi.eleicao.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {
    @Autowired
    CandidatoRepository candidatoRepository;

    public Candidato create(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    public List<Candidato> findAll() {
        return candidatoRepository.findAll();
    }

}
