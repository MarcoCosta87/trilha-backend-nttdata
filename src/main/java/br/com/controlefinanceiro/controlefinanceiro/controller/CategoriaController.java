package br.com.controlefinanceiro.controlefinanceiro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controlefinanceiro.controlefinanceiro.entity.Categoria;
import br.com.controlefinanceiro.controlefinanceiro.repository.CategoriaRepository;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@PostMapping("/criar")
	public Categoria criarCategoria(@RequestBody Categoria categoria) {

		return categoriaRepository.save(categoria);
	}

	@GetMapping("/ler")
	public List<Categoria> ler() {
		return categoriaRepository.findAll();
	}

	@GetMapping("/ler/{id}")
	public Optional<Categoria> findById(@PathVariable("id") Long id) {
		return categoriaRepository.findById(id);

	}

	@PutMapping("/updated/{id}")
	public Categoria update(@PathVariable("id") @RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);

	}

	@DeleteMapping("/Deletar/{id}")
	public void categoriaDeletar(@PathVariable("id") Long id) {
		categoriaRepository.deleteById(id);

	}

}
