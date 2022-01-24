package br.fefsribeiro.controle.financeiro.api.repository;

import br.fefsribeiro.controle.financeiro.api.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
