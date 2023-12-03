package br.com.casi.eleicao.controller;

import br.com.casi.eleicao.controller.dto.CargoDTO;
import br.com.casi.eleicao.entity.Cargo;
import br.com.casi.eleicao.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    CargoService cargoService;

    @PostMapping
     public ResponseEntity<Cargo> create(@RequestBody CargoDTO cargoDTO) {
        Cargo cargo = new Cargo(cargoDTO.id(), cargoDTO.nome(), cargoDTO.descricao());
        Cargo cargoCreated = cargoService.create(cargo);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoCreated);
    }
}
