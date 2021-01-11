package com.tienda.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.backend.models.dao.IEstadoEnvio;
import com.tienda.backend.models.entities.EstadoEnvio;
import com.tienda.backend.services.interfaces.IEstadoEnvioService;

@Service
public class EstadoEnvioService implements IEstadoEnvioService{

	@Autowired
	private IEstadoEnvio dao;
	

	@Override
	//@Transactional(readOnly=true)
	public EstadoEnvio findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	

	@Override
	//@Transactional(readOnly=true)
	public List<EstadoEnvio> findAll() {
		// TODO Auto-generated method stub
		return (List<EstadoEnvio>) dao.findAll() ;
	}

}
