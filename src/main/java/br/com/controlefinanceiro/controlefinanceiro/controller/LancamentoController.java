package br.com.controlefinanceiro.controlefinanceiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controlefinanceiro.controlefinanceiro.entity.Lancamento;
import br.com.controlefinanceiro.controlefinanceiro.repository.LancamentoRepository;

@RestController
@RequestMapping("/Lancamento")
public class LancamentoController {

	@Autowired
	private LancamentoRepository lancamentoRepository;

	@PostMapping("/criar")
	public long criar(@RequestBody Lancamento lancamento) {
		System.out.println("Categoria identificada");
		for (Lancamento value : lancamentoRepository.findAll()) {
			if (value.getId() == lancamento.getId()) {
				System.out.println("Id: " + lancamento.getId() + " já existente no banco de dados");
				return -1L;
			}
		}
		return lancamentoRepository.save(lancamento).getId();
	}

	@GetMapping("/ler")
	public List<Lancamento> ler() {

		return lancamentoRepository.findAll();
	}

	@GetMapping("/ler/{id}")
	public Lancamento findById(@PathVariable("id") Long id) {
		return lancamentoRepository.findById(id).get();

	}

	@PutMapping("/updated/{id}")
	public Lancamento update(@PathVariable("id") @RequestBody Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);

	}

	@DeleteMapping("/Deletar/{id}")
	public void lancamentoDeletar(@PathVariable("id") Long id) {
		lancamentoRepository.deleteById(id);

	}

	@GetMapping("/ler/paidtrue")
	public ResponseEntity<List<Lancamento>> findByPaidtrue() {
		try {
			List<Lancamento> lancamento = lancamentoRepository.findByPaid(true);

			if (lancamento.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(lancamento, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/ler/paidfalse")
	public ResponseEntity<List<Lancamento>> findByPaidfalse() {
		try {
			List<Lancamento> lancamento = lancamentoRepository.findByPaid(false);

			if (lancamento.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(lancamento, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}