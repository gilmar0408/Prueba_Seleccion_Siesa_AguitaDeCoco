package com.co.siesa.products.api.service;

import com.co.siesa.products.api.entity.Product;
import com.co.siesa.products.api.entity.ResponseProduct;

public interface IProductService {
	
	ResponseProduct create (Product product);
	Product search (int id);
	Iterable<Product>  list();
	
}
