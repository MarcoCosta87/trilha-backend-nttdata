package br.com.controlefinanceiro.controlefinanceiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controlefinanceiro.controlefinanceiro.entity.Lancamento;



public interface LancamentoRepository extends JpaRepository<Lancamento,Long> {
	 List<Lancamento> findByPaid(Boolean paid);
}