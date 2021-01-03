package com.tienda.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tienda.backend.models.entities.CabFactura;

@Table(name = "Estado_Envio")
@Entity

public class EstadoEnvio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_estenvio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idestenvio;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "estadoenvio", fetch = FetchType.LAZY)
	private List<CabFactura> cabfacturas;

	public EstadoEnvio() {

	}

	public EstadoEnvio(Long id) {

		this.idestenvio = id;
	}

	public Long getIdestenvio() {
		return idestenvio;
	}

	public void setIdestenvio(Long idestenvio) {
		this.idestenvio = idestenvio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CabFactura> getCabfacturas() {
		return cabfacturas;
	}

	public void setCabfacturas(List<CabFactura> cabfacturas) {
		this.cabfacturas = cabfacturas;
	}

}
