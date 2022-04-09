package br.fefsribeiro.controle.financeiro.api.repository;

import br.fefsribeiro.controle.financeiro.api.application.core.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
