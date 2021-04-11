package com.co.siesa.products.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_product;
	
	@Column(name="title", nullable = false ,length = 100 )
	private String title;
	
	
	@Column(name="some_description", nullable = false  )
	private String some_description;
	
	@Column(name="price", nullable = false)
	private double price;
	
	private int discount;
	
	
	private String image;
	

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSome_description() {
		return some_description;
	}

	public void setSome_description(String some_description) {
		this.some_description = some_description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
