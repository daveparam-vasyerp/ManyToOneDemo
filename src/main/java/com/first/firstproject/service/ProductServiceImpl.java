package com.first.firstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.firstproject.dto.ProductDto;
import com.first.firstproject.model.Product;
import com.first.firstproject.repository.CategoryRepository;
import com.first.firstproject.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrepository;
	
	@Autowired
	private CategoryRepository categoryrepository;
	
	@Override
	public List<Product> getAllProduct() {
		
		return productrepository.findAll();
	}

	@Override
	public Product getProductById(long productId) {
		
		return productrepository.findById(productId).orElseThrow(()-> new EntityNotFoundException("product not found by id"));
	}

	@Override
	public Product addProduct(ProductDto product) {
		Product product1= new Product(product.getProductName(),product.getProductDesc(),product.getPrice(),categoryrepository.findById(product.getCategoryId()).orElse(null));
		
		return productrepository.save(product1);
	}

	
	
}
