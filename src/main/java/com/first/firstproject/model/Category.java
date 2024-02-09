package com.first.firstproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category {
	@Id
	@GeneratedValue
	private long categoryId;
	private String categoryName;
	
	

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	
	
}
