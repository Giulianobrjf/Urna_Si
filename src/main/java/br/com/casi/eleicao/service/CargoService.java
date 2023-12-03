package br.com.casi.eleicao.service;

import br.com.casi.eleicao.entity.Cargo;
import br.com.casi.eleicao.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {
    @Autowired
    CargoRepository cargoRepository;

    public Cargo create(Cargo cargo){ return cargoRepository.save(cargo); }
}
