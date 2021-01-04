package com.tienda.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.backend.models.dao.IClient;
import com.tienda.backend.models.entities.Client;
import com.tienda.backend.services.interfaces.IClientService;

@Service
public class ClientService implements IClientService{

	@Autowired
	private IClient dao;

	@Override
	public void save(Client p) {
		dao.save(p);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Client findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Client p  = this.findById(id);
		dao.delete(p);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Client> findAll() {
		return (List<Client>) dao.findAll();
	}

}
