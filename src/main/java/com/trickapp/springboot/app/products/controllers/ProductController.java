package com.trickapp.springboot.app.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trickapp.springboot.app.products.models.entity.Product;
import com.trickapp.springboot.app.products.models.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/getAll")
	public List<Product> getAll() {
		return productService.findAll();
	}

	@GetMapping("/getById/{id}")
	public Product getById(@PathVariable Long id) {
		return productService.findById(id);
	}
}
