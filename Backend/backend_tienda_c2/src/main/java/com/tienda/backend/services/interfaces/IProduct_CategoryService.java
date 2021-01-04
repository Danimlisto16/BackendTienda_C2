package com.tienda.backend.services.interfaces;

import java.util.List;

import com.tienda.backend.models.entities.Product_category;

public interface IProduct_CategoryService {
	
	public void save(Product_category pc);
	public Product_category findById(Long id);
	public void delete(Long id);
	public List<Product_category> findAll();
}
