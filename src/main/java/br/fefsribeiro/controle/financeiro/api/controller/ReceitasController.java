package br.fefsribeiro.controle.financeiro.api.controller;

import br.fefsribeiro.controle.financeiro.api.dto.ReceitaDto;
import br.fefsribeiro.controle.financeiro.api.model.Receita;
import br.fefsribeiro.controle.financeiro.api.service.ReceitaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/api")
@Api(tags = "Receitas")
public class ReceitasController {

    @Autowired
    private ReceitaService receitaService;

    @PostMapping("/receita")
    @ApiOperation("Cadastrar Receita")
    public ResponseEntity<Receita> cadastrar(@RequestBody @Valid ReceitaDto receitaDto, UriComponentsBuilder uriBuilder){
        Receita newReceita = receitaService.cadastrar(receitaDto);
        URI uri = uriBuilder
                .path("/receita")
                .buildAndExpand(newReceita)
                .toUri();

        return ResponseEntity.created(uri).body(newReceita);

    }
}
