package br.com.controlefinanceiro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controlefinanceiro.dto.EntryDto;
import br.com.controlefinanceiro.entity.Category;
import br.com.controlefinanceiro.entity.Entry;
import br.com.controlefinanceiro.repository.CategoryRepository;
import br.com.controlefinanceiro.repository.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	private ModelMapper modelMapper;

	private List<EntryDto> entryDtoList = new ArrayList<>();

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
		entry1.setCategoryId(entry.getCategory());

	}

	public void deletar(Long id) {
		entryRepository.deleteById(id);
	}

	public List<Entry> resumoListDto() {
		List<Entry> listRepository = entryRepository.findAll();
		List<Entry> listResumo = new ArrayList<>();//

		// percorrer a lista repositry
		for (Entry item1 : listRepository) {
			Boolean validacaoLista = false;
			// percorrer na listaresumo se existe obj da categpria
			for (Entry obj1 : listResumo) {
				// se existir adicinar o item add.
				if (item1.getCategory().getId().equals(obj1.getCategory().getId())) {
					System.out.println("if foi verdadeiro");
					validacaoLista = true;
				}
			}
			if (validacaoLista) {
				// adicioar o amount,
				for (Entry obj1 : listResumo) {
					// se existir adicinar o item add.
					if (item1.getCategory().getId().equals(obj1.getCategory().getId())) {
						System.out.println("if foi verdadeiro");
						obj1.setAmount(obj1.getAmount() + item1.getAmount());
					}
				}
			} else {
				listResumo.add(item1);
			}
		}
		return listResumo;
	}

	private EntryDto mapToDto(Entry entry) {
		return modelMapper.map(entry, EntryDto.class);
	}

	private Entry mapToEntity(EntryDto entryDto) {
		return modelMapper.map(entryDto, Entry.class);
	}
}