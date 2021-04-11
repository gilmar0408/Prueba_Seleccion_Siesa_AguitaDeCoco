package com.co.siesa.products.api.service.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.siesa.products.api.entity.Product;
import com.co.siesa.products.api.entity.ResponseProduct;
import com.co.siesa.products.api.repository.ProductRepository;
import com.co.siesa.products.api.service.IProductService;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private ProductRepository  repoProduct;
	
	


	@Override
	public ResponseProduct create(Product product) {
		
		ResponseProduct response = new ResponseProduct();
		repoProduct.save(product);
		response.setMessage("Producto creado exitosamente");
		response.setProduct(product);
		
		
		return response;
	}

	@Override
	public Product search(int id) {
		
		Optional<Product> productFinded = repoProduct.findById(id);
		Product product = new Product();
		
		if (productFinded.isPresent()) {
			product= productFinded.get();
		}
		
		return product;
	}

	@Override
	public Iterable<Product> list() {
		
		return repoProduct.list();
	}

}
