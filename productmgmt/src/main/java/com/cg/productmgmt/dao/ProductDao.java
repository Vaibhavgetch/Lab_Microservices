package com.cg.productmgmt.dao;

import java.util.List;

import com.cg.productmgmt.entity.Product;

public interface ProductDao {

	Product save(Product product);

	List<Product> fetchAll();

	Product findById(String id);

}
