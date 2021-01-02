package com.tienda.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.backend.models.entities.Product;

public interface IProduct extends CrudRepository<Product,Long>{

	
}
