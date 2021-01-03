package com.tienda.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.backend.models.entities.EstadoEnvio;

public interface IEstadoEnvio extends CrudRepository<EstadoEnvio, Long> {

}
