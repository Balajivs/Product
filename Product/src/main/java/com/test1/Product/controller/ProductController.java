package com.test1.Product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ProductController {

	
	@GetMapping(value = "/getDisplay")
	public String getDisplay() {

		return "Hello, I am from Product Controller";

	}
}
