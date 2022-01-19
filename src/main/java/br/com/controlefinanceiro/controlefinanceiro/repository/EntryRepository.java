package br.com.controlefinanceiro.controlefinanceiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controlefinanceiro.controlefinanceiro.entity.Entry;



public interface EntryRepository extends JpaRepository<Entry, Long> {

	List<Entry> findByPaid(Boolean paid);

}
