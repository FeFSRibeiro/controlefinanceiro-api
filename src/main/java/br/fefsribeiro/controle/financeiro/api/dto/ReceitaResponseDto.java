package br.fefsribeiro.controle.financeiro.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@AllArgsConstructor
public class ReceitaResponseDto {

    private String descricao;

    private BigDecimal valor;

    private LocalDate data;
}
