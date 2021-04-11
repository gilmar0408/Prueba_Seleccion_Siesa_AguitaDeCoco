package com.co.siesa.products.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.siesa.products.api.entity.Product;
import com.co.siesa.products.api.entity.ResponseProduct;
import com.co.siesa.products.api.service.IProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private IProductService serviceProduct;
	
	@CrossOrigin
	@PostMapping("/createProduct")
	public ResponseProduct create(@RequestBody Product product) {
		
		return serviceProduct.create(product);
	}
	
	@CrossOrigin
	@GetMapping("/list")
	public Iterable<Product> list(){
		
		return serviceProduct.list();
	}
	

}
