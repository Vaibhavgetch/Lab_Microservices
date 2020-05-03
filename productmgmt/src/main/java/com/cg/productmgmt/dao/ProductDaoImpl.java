package com.cg.productmgmt.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.productmgmt.entity.Product;

public class ProductDaoImpl implements ProductDao{
	   private Map<String,Product>store=new HashMap<String, Product>();
	   
	public Product save(Product product) {
		store.put(product.getProductId(),product);
		return null;
	}

	public List<Product> fetchAll() {
		Collection<Product>values= store.values();
	       List<Product>list=new ArrayList<Product>(values);
	       return list;
	}

	public Product findById(String id) {
		 Product product= store.get(id);
	       return product;
		
	}
	
	
	

}
