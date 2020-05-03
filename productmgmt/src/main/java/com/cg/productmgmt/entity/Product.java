package com.cg.productmgmt.entity;

import java.util.Objects;

public class Product {

    private String productId ;
    private double price ;
    private String productName ;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Product product = (Product) o;
		return productId.equals(product.productId);
	}	
    
    
    
    
    
}
