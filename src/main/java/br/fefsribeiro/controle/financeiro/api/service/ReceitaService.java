package br.fefsribeiro.controle.financeiro.api.service;

import br.fefsribeiro.controle.financeiro.api.dto.ReceitaDto;
import br.fefsribeiro.controle.financeiro.api.model.Receita;
import br.fefsribeiro.controle.financeiro.api.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;


    public Receita cadastrar(ReceitaDto receitaDto) {

        Receita newReceita = Receita.builder()
                .descricao(receitaDto.getDescricao())
                .data(receitaDto.getData())
                .valor(receitaDto.getValor())
                .build();

            return receitaRepository.save(newReceita);

    }
}
