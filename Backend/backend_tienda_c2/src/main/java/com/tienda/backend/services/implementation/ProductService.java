package com.tienda.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.backend.models.dao.IProduct;
import com.tienda.backend.models.entities.Product;
import com.tienda.backend.services.interfaces.IProductService;

@Service

public class ProductService implements IProductService {

	@Autowired
	private IProduct dao;
	
	
	@Override
	public void save(Product p) {
		dao.save(p);
	}

	@Override
	public Product findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Product p  = this.findById(id);
		dao.delete(p);
	}

	@Override
	public List<Product> findAll() {
		return (List<Product>) dao.findAll();
	}

}
