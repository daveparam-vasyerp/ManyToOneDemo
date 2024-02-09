package com.first.firstproject.service;

import java.util.List;

import com.first.firstproject.dto.ProductDto;
import com.first.firstproject.model.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();
	public Product getProductById(long productId);
	public Product addProduct(ProductDto product);
}
