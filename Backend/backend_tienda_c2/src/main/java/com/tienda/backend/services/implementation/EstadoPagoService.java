package com.tienda.backend.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.backend.models.dao.IEstadoPago;
import com.tienda.backend.models.entities.EstadoPago;
import com.tienda.backend.services.interfaces.IEstadoPagoService;

@Service
public class EstadoPagoService implements IEstadoPagoService {

	
	private IEstadoPago dao;
	

	@Override
	@Transactional(readOnly=true)
	public EstadoPago findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	

	@Override
	@Transactional(readOnly=true)
	public List<EstadoPago> findAll() {
		// TODO Auto-generated method stub
		return (List<EstadoPago>) dao.findAll() ;
	}

}