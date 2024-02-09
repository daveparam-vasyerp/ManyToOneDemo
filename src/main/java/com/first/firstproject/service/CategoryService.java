package com.first.firstproject.service;

import java.util.List;

import com.first.firstproject.model.Category;

public interface CategoryService {
	
	public List<Category> getAllCategory();
	public Category getCategoryById(long categoryId);
	public Category addCategory(Category category);
	

}
