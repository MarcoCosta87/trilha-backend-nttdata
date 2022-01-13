package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Lancamento;

@RestController
@RequestMapping("/Lancamento")
public class LancamentoController {

	private final List<Lancamento> lista = new ArrayList<>();

	@PostMapping("/criar")
	public ResponseEntity<List<Lancamento>> criar(@RequestBody Lancamento lancamento) {

		Lancamento lancamento1 = new Lancamento();
		lancamento1.setId(lancamento.getId());
		lancamento1.setName(lancamento.getName());
		lancamento1.setDescription(lancamento.getDescription());
		lancamento1.setType(lancamento.getType());
		lancamento1.setAmount(lancamento.getAmount());
		lancamento1.setDate(lancamento.getDate());
		lancamento1.setPaid(lancamento.isPaid());
		lancamento1.setCategoryId(lancamento.getCategoryId());
		lista.add(lancamento1);
		return ResponseEntity.status(HttpStatus.CREATED).body(lista);

	}

	@GetMapping("/ler")
	public ResponseEntity<List<Lancamento>> ler() {
		Collections.sort(lista, Comparator.comparing(Lancamento::getDate));

		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}

}
