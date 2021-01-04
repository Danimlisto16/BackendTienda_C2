package com.tienda.backend.services.interfaces;

import java.util.List;

import com.tienda.backend.models.entities.Product;



public interface IProductService {

	public void save(Product p);
	public Product findById(Long id);
	public void delete(Long id);
	public List<Product> findAll();
}
