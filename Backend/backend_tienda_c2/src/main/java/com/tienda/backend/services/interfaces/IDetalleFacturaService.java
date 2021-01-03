package com.tienda.backend.services.interfaces;

import java.util.List;

import com.tienda.backend.models.entities.DetalleFactura;

public interface IDetalleFacturaService {
	
	public void save(DetalleFactura c);
	public DetalleFactura findById(Long id);
	public void delete(Long id);
	public List<DetalleFactura> findAll();

}
