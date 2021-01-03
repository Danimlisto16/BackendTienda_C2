package com.tienda.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.backend.models.entities.DetalleFactura;

public interface IDetalleFactura extends CrudRepository<DetalleFactura, Long>{

}
