package br.com.controlefinanceiro.controlefinanceiro.controller;

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

import br.com.controlefinanceiro.controlefinanceiro.entity.Entry;
import br.com.controlefinanceiro.service.EntryService;

@RestController
@RequestMapping("/entries")
public class EntryController {
	
	@Autowired
	private EntryService entryService;

	@PostMapping
	public ResponseEntity<Entry> create(@RequestBody Entry entry) {
		entry = entryService.criar(entry);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entry.getId()).toUri();
		if (entryService.validateCategoryById(entry.getCategoryId())) {

		} else {
			System.out.println("categoria inexistente!!!!");
		}

		return ResponseEntity.created(uri).body(entry);
	}

	@GetMapping
	public ResponseEntity<List<Entry>> findAllEntry() {
		List<Entry> list = entryService.findAllEntry();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Entry> findById(@PathVariable("id") Long id) {
		Entry entry = entryService.findById(id);
		return ResponseEntity.ok(entry);

	}

	@PutMapping("/{id}")
	public ResponseEntity<Entry> updated(@PathVariable Long id, @RequestBody Entry entry) {
		entry = entryService.updated(id, entry);
		return ResponseEntity.ok().body(entry);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Entry> deletar(@PathVariable Long id) {
		entryService.deletar(id);
		return ResponseEntity.noContent().build();

	}

}