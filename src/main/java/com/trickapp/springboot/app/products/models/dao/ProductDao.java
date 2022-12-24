package com.trickapp.springboot.app.products.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.trickapp.springboot.app.products.models.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long>{

}
