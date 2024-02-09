package com.first.firstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.firstproject.model.Category;
import com.first.firstproject.repository.CategoryRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryrepository;

	@Override
	public List<Category> getAllCategory() {
		
		return categoryrepository.findAll();
	}

	@Override
	public Category getCategoryById(long categoryId) {
		
		return categoryrepository.findById(categoryId).orElseThrow(()-> new EntityNotFoundException("category not found by this id"));
	}

	@Override
	public Category addCategory(Category category) {
		
		return categoryrepository.save(category);
	}

}
