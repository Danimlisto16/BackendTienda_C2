package com.tienda.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.backend.models.entities.Client;

public interface IClient extends CrudRepository<Client,Long> {

}
