package br.fefsribeiro.controle.financeiro.api.application.receita;

import br.fefsribeiro.controle.financeiro.api.domain.receita.Receita;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReceitaDto {


    private String descricao;
    private BigDecimal valor;
    private LocalDate data;

    public ReceitaDto(String descricao,BigDecimal valor,LocalDate data ){
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public Receita criarReceita(){
        return new Receita(
                descricao,
                valor,
                data
        );
    }
}
