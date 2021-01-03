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

@Table(name="Estado_Pago")
@Entity

public class EstadoPago implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_estpago")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idestpago;	
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy="estadopago", fetch=FetchType.LAZY)
	private List<CabFactura> cabfacturas;

	
public EstadoPago() {
		
	}
	
	public EstadoPago(Long id) {
		
		this.idestpago = id;
	}

	public Long getIdestpago() {
		return idestpago;
	}

	public void setIdestpago(Long idestpago) {
		this.idestpago = idestpago;
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
