package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Categoria;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {

	private final List<Categoria> lista = new ArrayList<>();

	@PostMapping("/criar")
	public ResponseEntity<List<Categoria>> criar(@RequestBody Categoria categoria) {
		Categoria categoria1 = new Categoria();
		categoria1.setId(categoria.getId());
		categoria1.setName(categoria.getName());
		categoria.setDescription(categoria.getDescription());
		lista.add(categoria1);
		return ResponseEntity.status(HttpStatus.CREATED).body(lista);

	}

	@GetMapping("/ler")
	public ResponseEntity<List<Categoria>> ler() {
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
}
