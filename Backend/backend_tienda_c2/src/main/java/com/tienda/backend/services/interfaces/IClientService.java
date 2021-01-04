package com.tienda.backend.services.interfaces;
import com.tienda.backend.models.entities.Client;
import java.util.List;

public interface IClientService {
	public void save(Client p);
	public Client findById(Long id);
	public void delete(Long id);
	public List<Client> findAll();

}
