package br.fefsribeiro.controle.financeiro.api.controller;

import br.fefsribeiro.controle.financeiro.api.dto.ReceitaDto;
import br.fefsribeiro.controle.financeiro.api.dto.ReceitaResponseDto;
import br.fefsribeiro.controle.financeiro.api.application.core.Receita;
import br.fefsribeiro.controle.financeiro.api.service.ReceitaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/api/receitas")
@Api(tags = "Receitas")
public class ReceitasController {

    @Autowired
    private ReceitaService receitaService;

    @PostMapping
    @ApiOperation("Cadastrar Receita")
    public ResponseEntity<Receita> cadastrar(@RequestBody @Valid ReceitaDto receitaDto, UriComponentsBuilder uriBuilder){
        Receita newReceita = receitaService.cadastrar(receitaDto);

        URI uri = uriBuilder
                .path("/receitas")
                .buildAndExpand(newReceita)
                .toUri();

        return ResponseEntity.created(uri).body(newReceita);

    }

    @GetMapping
    @ApiOperation("Consultar Receita")
    public Page<ReceitaResponseDto> listar(@PageableDefault(size = 10 ) Pageable paginacao){
        return receitaService.listar(paginacao);
    }
}
