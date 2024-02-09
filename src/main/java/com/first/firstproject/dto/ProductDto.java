package com.first.firstproject.dto;

public class ProductDto {
	
	private String ProductName;
	private String ProductDesc;
	private long productPrice;
	private long categoryId;
	
	public ProductDto(String productName, String productDesc, long productPrice, long categoryId) {
		super();
		ProductName = productName;
		ProductDesc = productDesc;
		this.productPrice = productPrice;
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDesc() {
		return ProductDesc;
	}

	public void setProductDesc(String productDesc) {
		ProductDesc = productDesc;
	}

	public long getPrice() {
		return productPrice;
	}

	public void setPrice(long price) {
		this.productPrice = price;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	

}
