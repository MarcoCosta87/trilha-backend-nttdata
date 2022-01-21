package br.com.controlefinanceiro.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.controlefinanceiro.entity.Category;
import br.com.controlefinanceiro.service.CategoryService;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping
	public ResponseEntity<Category> criarCategory(@RequestBody Category category) {
		category = categoryService.criarCategory(category);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(category.getId())
				.toUri();
		return ResponseEntity.created(uri).body(category);
	}

	@GetMapping
	public ResponseEntity<List<Category>> findAllCategory() {
		List<Category> list = categoryService.findAllCategory();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("{id}")
	public ResponseEntity<Category> findById(@PathVariable("id") Long id) {
		Category category = categoryService.findById(id);
		return ResponseEntity.ok(category);

	}

	@PutMapping("/{id}")
	public ResponseEntity<Category> updated(@PathVariable Long id, @RequestBody Category category) {
		category = categoryService.updated(id, category);
		return ResponseEntity.ok().body(category);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Category> deletar(@PathVariable Long id) {
		categoryService.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
