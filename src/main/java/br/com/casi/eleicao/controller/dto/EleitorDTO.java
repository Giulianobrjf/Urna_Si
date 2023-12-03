package br.com.casi.eleicao.controller.dto;

public record EleitorDTO(
        String nome,
        String vinculo,
        String celular,
        String email,
        boolean nulo
) {
    // Pode adicionar métodos adicionais, se necessário
}