package com.tienda.backend.services.interfaces;

import java.util.List;

import com.tienda.backend.models.entities.CabFactura;

public interface ICabFacturaService {
	
	public void save(CabFactura c);
	public CabFactura findById(Long id);
	public void delete(Long id);
	public List<CabFactura> findAll();

}
