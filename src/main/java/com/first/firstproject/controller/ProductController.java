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

import com.first.firstproject.dto.ProductDto;
import com.first.firstproject.model.Product;
import com.first.firstproject.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

		@Autowired
		private ProductService productservice;
		
		@GetMapping("/getAllProduct")
		
		public ResponseEntity<List<Product>> getAllProduct(){
			return new ResponseEntity<>(productservice.getAllProduct(),HttpStatus.OK);
		}
		
		@GetMapping("/getProductById")
		public ResponseEntity<Product> getProductById(@PathVariable long productId){
			return ResponseEntity.ok(productservice.getProductById(productId));
		}
		
		@PostMapping("/addProduct")
	
		public ResponseEntity<Product> addProduct(@RequestBody ProductDto product){
			return ResponseEntity.ok(productservice.addProduct(product));
		}

}
