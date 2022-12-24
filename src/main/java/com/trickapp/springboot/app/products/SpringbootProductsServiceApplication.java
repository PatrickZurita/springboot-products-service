package com.trickapp.springboot.app.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.trickapp.springboot.app.products.models.service")
@ComponentScan(basePackages = "com.trickapp.springboot.app.products.models.dao")
public class SpringbootProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProductsServiceApplication.class, args);
	}

}
