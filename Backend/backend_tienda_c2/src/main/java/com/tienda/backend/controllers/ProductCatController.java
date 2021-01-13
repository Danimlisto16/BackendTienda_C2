package com.tienda.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.backend.models.entities.Product_category;
import com.tienda.backend.services.interfaces.IProduct_CategoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/productcat")
public class ProductCatController {
	
	@Autowired
	private IProduct_CategoryService service;
	
	@GetMapping("")
	public List<Product_category> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	public Product_category create(@RequestBody Product_category pc ) {
		service.save(pc);
		return pc;
	}
	
	@GetMapping("/{id}")
	public Product_category retrieve(@PathVariable(name ="id") Long id) {
		return service.findById(id);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Product_category update(@RequestBody Product_category pc, @PathVariable Long id) {		 			
		service.save(pc);
		return pc;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}	

}
