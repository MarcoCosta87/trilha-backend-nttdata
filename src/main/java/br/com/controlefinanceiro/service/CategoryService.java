package br.com.controlefinanceiro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controlefinanceiro.controlefinanceiro.entity.Category;
import br.com.controlefinanceiro.controlefinanceiro.repository.CategoryRepository;



@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Long idCategoryfindByName(Category name) {

		Optional<Category> categoryName = categoryRepository.findByName(name.getName());

		if (categoryName.isPresent())
			return categoryName.get().getId();
		else
			System.out.println("Nome não encontrado");

		return categoryName.get().getId();

	}

	public Category criarCategory(Category category) {
		return categoryRepository.save(category);

	}

	public List<Category> findAllCategory() {
		return categoryRepository.findAll();

	}

	public Category findById(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
	}

	public Category updated(Long id, Category category) {
		Category category1 = categoryRepository.getById(id);
		updated(category1, category);
		return categoryRepository.save(category1);

	}

	private void updated(Category category1, Category category) {
		category1.setName(category.getName());
		category1.setDescription(category.getDescription());

	}

	public void deletar(Long id) {
		categoryRepository.deleteById(id);
	}

}
