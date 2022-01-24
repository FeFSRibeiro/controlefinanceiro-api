package br.fefsribeiro.controle.financeiro.api.repository;

import br.fefsribeiro.controle.financeiro.api.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {
}
