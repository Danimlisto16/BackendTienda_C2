package com.tienda.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.backend.models.dao.ICabFactura;
import com.tienda.backend.models.entities.CabFactura;
import com.tienda.backend.services.interfaces.ICabFacturaService;

@Service
public class CabFacturaService implements ICabFacturaService{
	
	@Autowired //Inyeccion de depencias
	private ICabFactura dao;
	@Override
	@Transactional
	public void save(CabFactura c) {
		try {
			dao.save(c);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public CabFactura findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<CabFactura> findAll() {
		// TODO Auto-generated method stub
		return (List<CabFactura>) dao.findAll() ;
	}

}





