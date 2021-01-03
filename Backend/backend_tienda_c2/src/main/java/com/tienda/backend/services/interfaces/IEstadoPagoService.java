package com.tienda.backend.services.interfaces;

import java.util.List;

import com.tienda.backend.models.entities.EstadoPago;

public interface IEstadoPagoService {
	
	public EstadoPago findById(Long id);
	
	public List<EstadoPago> findAll();


}
