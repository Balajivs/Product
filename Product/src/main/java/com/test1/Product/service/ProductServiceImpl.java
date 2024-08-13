package com.test1.Product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test1.Product.entity.Product;
import com.test1.Product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository repository;
	
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	
	
}
