package com.co.siesa.products.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.co.siesa.products.api.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query(value="SELECT * FROM productos", nativeQuery = true)
	Iterable<Product>  list();

}
