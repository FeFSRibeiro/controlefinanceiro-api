package br.fefsribeiro.controle.financeiro.api.dto;

import lombok.Getter;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class ReceitaDto {

    @NotBlank
    private String descricao;
    @NotEmpty
    @PositiveOrZero
    private BigDecimal valor;
    @NotBlank
    private LocalDate data;
}
