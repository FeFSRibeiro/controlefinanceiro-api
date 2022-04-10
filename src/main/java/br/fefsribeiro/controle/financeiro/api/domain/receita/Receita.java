package br.fefsribeiro.controle.financeiro.api.domain.receita;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Receita {

    private String descricao;

    private BigDecimal valor;

    private LocalDate data;

    public Receita(String descricao, BigDecimal valor,LocalDate data ){
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
}
