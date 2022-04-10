package br.fefsribeiro.controle.financeiro.api.domain.receita;

import java.util.List;

public interface ReceitaRepository {

    List<Receita> listarTodasReceitasCadastradas();

    void cadastrar(Receita receita);

    List<Receita> buscar(String descricao);
}
