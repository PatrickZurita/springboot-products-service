package com.trickapp.springboot.app.products.models.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.trickapp.springboot.app.products.models.dao.ProductDao;
import com.trickapp.springboot.app.products.models.entity.Product;

public class ProductServiceImpl implements IProductService{
		
	private ProductDao productDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) productDao.findAll();
	} 

	@Override
	public Product findById(Long id) {
		return productDao.findById(id).orElse(null); // productDao.findById(id) is a Optional, https://www.baeldung.com/java-optional
	}

}
