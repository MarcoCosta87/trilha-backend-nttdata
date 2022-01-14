package br.com.controlefinanceiro.controlefinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controlefinanceiro.controlefinanceiro.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
