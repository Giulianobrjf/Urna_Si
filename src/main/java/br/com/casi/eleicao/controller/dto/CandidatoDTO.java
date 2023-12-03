package br.com.casi.eleicao.controller.dto;

public record CandidatoDTO(
        String nome,
        String vinculo,
        String celular,
        String email,
        String cargo
) {
    // Pode adicionar métodos adicionais, se necessário
}