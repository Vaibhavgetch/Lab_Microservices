package com.cg.productmgmt.service;

import java.util.List;

import com.cg.productmgmt.entity.Product;

public interface ProductService {
	
	Product add(Product product);

    List<Product> fetchAll();

    Product findById(String id);


}
