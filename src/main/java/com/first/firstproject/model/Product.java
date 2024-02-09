package com.first.firstproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Product {
	@Id
	@GeneratedValue
	private long productId;
	private String productName;
	private String productDesc;
	private long productPrice;
	
	@ManyToOne
	private Category category;

	public Product(String productName, String productDesc, long productPrice, Category category) {
		super();
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.category = category;
	}

	
	
	

}
