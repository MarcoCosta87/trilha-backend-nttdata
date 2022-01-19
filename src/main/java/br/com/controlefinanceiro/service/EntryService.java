package br.com.controlefinanceiro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controlefinanceiro.controlefinanceiro.entity.Category;
import br.com.controlefinanceiro.controlefinanceiro.entity.Entry;
import br.com.controlefinanceiro.controlefinanceiro.repository.CategoryRepository;
import br.com.controlefinanceiro.controlefinanceiro.repository.EntryRepository;



@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	public boolean validateCategoryById(Category IdCategory) {

		Optional<Category> idcategory = categoryRepository.findById(IdCategory.getId());

		if (idcategory.isPresent())
			return true;
		else
			return false;
	}

	public Entry criar(Entry entry) {
		return entryRepository.save(entry);

	}

	public List<Entry> findAllEntry() {
		return entryRepository.findAll();

	}

	public Entry findById(Long id) {
		Optional<Entry> entry = entryRepository.findById(id);
		return entry.get();
	}

	public Entry updated(Long id, Entry entry) {
		Entry entry1 = entryRepository.getById(id);
		updated(entry1, entry);
		return entryRepository.save(entry1);

	}

	private void updated(Entry entry1, Entry entry) {
		entry1.setName(entry.getName());
		entry1.setDescription(entry.getDescription());
		entry1.setType(entry.getType());
		entry1.setAmount(entry.getAmount());
		entry1.setDate(entry.getDate());
		entry1.setPaid(entry.isPaid());
		entry1.setCategoryId(entry.getCategoryId());

	}

	public void deletar(Long id) {
		entryRepository.deleteById(id);
	}

}