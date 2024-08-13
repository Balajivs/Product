package com.test1.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test1.Product.entity.Product;
import com.test1.Product.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping(value = "/getDisplay")
	public String getDisplay() {

		return "Hello, I am from Product Controller";

	}
	
	
	@PostMapping(value="saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		
		
		return productService.saveProduct(product);
	}
}
