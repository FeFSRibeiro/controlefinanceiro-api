package br.fefsribeiro.controle.financeiro.api.service;

import br.fefsribeiro.controle.financeiro.api.dto.ReceitaDto;
import br.fefsribeiro.controle.financeiro.api.dto.ReceitaResponseDto;
import br.fefsribeiro.controle.financeiro.api.application.core.Receita;
import br.fefsribeiro.controle.financeiro.api.repository.ReceitaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    private ModelMapper modelMapper = new ModelMapper();


    public Receita cadastrar(ReceitaDto receitaDto) {

        Receita novaReceita = Receita.builder()
                .descricao(receitaDto.getDescricao())
                .data(receitaDto.getData())
                .valor(receitaDto.getValor())
                .build();

            return receitaRepository.save(novaReceita);

    }

    public Page<ReceitaResponseDto> listar(Pageable paginacao) {
        Page<Receita> receitas = receitaRepository.findAll(paginacao);
        return receitas
                .map(r -> modelMapper.map(r,ReceitaResponseDto.class));
    }
}
