package com.cg.productmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.productmgmt.dao.ProductDao;
import com.cg.productmgmt.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	 private ProductDao dao;
	 
	
   public ProductDao getDao() {
		return dao;
	}
      @Autowired
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	public Product add(Product product) {
		 dao.save(product);
	        return product;
	}

	public List<Product> fetchAll() {
		List<Product> list = dao.fetchAll();
        return list;
		
	}
	
	public Product findById(String id) {
		Product product=dao.findById(id);
        return product;
	}

}
