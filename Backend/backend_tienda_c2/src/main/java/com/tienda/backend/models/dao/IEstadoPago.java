package com.tienda.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.backend.models.entities.EstadoPago;

public interface IEstadoPago extends CrudRepository<EstadoPago, Long>{

}
