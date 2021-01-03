package com.tienda.backend.services.interfaces;

import java.util.List;

import com.tienda.backend.models.entities.EstadoEnvio;

public interface IEstadoEnvioService {
	
	public EstadoEnvio findById(Long id);
	
	public List<EstadoEnvio> findAll();


}
