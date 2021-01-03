package com.tienda.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.backend.models.dao.IDetalleFactura;
import com.tienda.backend.models.entities.DetalleFactura;

import com.tienda.backend.services.interfaces.IDetalleFacturaService;

@Service
public class DetalleFacturaService implements IDetalleFacturaService {

	@Autowired // Inyeccion de depencias
	private IDetalleFactura dao;

	@Override
	@Transactional

	public void save(DetalleFactura c) {
		try {
			dao.save(c);
		} catch (Exception ex) {
			throw ex;
		}

	}

	@Override
	@Transactional(readOnly = true)
	public DetalleFactura findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		} catch (Exception ex) {
			throw ex;
		}

	}

	@Override
	@Transactional(readOnly = true)
	public List<DetalleFactura> findAll() {
		return (List<DetalleFactura>) dao.findAll();
	}

}
