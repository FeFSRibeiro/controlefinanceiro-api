package br.fefsribeiro.controle.financeiro.api.application.despesa;

import br.fefsribeiro.controle.financeiro.api.domain.despesa.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {
}
