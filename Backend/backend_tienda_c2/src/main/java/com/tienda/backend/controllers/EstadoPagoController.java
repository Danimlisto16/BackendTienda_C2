package com.tienda.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.backend.models.entities.EstadoPago;
import com.tienda.backend.services.interfaces.IEstadoPagoService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/estadopago")
public class EstadoPagoController {
	
	@Autowired
	private IEstadoPagoService service;
	
	@GetMapping("/{id}")
	public EstadoPago retrive(@PathVariable(value="id") Long id){
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<EstadoPago> list(){
		return service.findAll();
	}

}
