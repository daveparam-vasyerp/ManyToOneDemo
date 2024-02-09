package com.first.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.firstproject.model.Category;
import com.first.firstproject.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping("/getAllCategory")
	public ResponseEntity<List<Category>> getAllCategory(){
		return new ResponseEntity<>(categoryservice.getAllCategory(),HttpStatus.OK);
	}
	
	@GetMapping("getcategoryById")
	public ResponseEntity<Category> getCategoryById(@PathVariable long categoryId){
		return ResponseEntity.ok(categoryservice.getCategoryById(categoryId));
		
	}
	@PostMapping("/addCategory")
	public ResponseEntity<Category> addCategory(@RequestBody Category category){
		return ResponseEntity.ok(categoryservice.addCategory(category));
	}
	
}
