package com.tienda.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.backend.models.dao.IProduct_category;
import com.tienda.backend.models.entities.Product_category;
import com.tienda.backend.services.interfaces.IProduct_CategoryService;

@Service
public class ProductCategoryService implements IProduct_CategoryService{
	
	@Autowired
	private IProduct_category dao;

	@Override
	public void save(Product_category pc) {
		dao.save(pc);
		
	}

	@Override
	public Product_category findById(Long id) {
		return dao.findById(id).get();	
	}

	@Override
	public void delete(Long id) {
		Product_category pc  = this.findById(id);
		dao.delete(pc);
	}

	@Override
	public List<Product_category> findAll() {
		return (List<Product_category>) dao.findAll();
	}
	
	
}
