package com.tienda.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Table(name="Cab_Factura")
@Entity


public class CabFactura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_cfactura")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCab;	
	
	@Column(name = "ruc_emisor")
	private String ruc;
	
	@Column(name = "fecha")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)	
	private Calendar fecha;
	
	@JoinColumn(name="fk_client", referencedColumnName="id_client")
	@ManyToOne
	private Client cliente;
	
	@Column(name = "estado_envio")	
	@Enumerated(value = EnumType.STRING)
	private EstadoEnvio estadoenvio;
	
	@Column(name = "estado_pago")	
	@Enumerated(value = EnumType.STRING)
	private EstadoPago estadopago;
	
	
	@OneToMany(mappedBy = "cabfactura", fetch = FetchType.LAZY)
	private List<DetalleFactura> detfacturas;
	
	public CabFactura() {
		
	}
	
	public CabFactura(Long id) {
		
		this.idCab = id;
	}
	
	public Long getIdCab() {
		return idCab;
	}

	public void setIdCab(Long idCab) {
		this.idCab = idCab;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public List<DetalleFactura> getDetfacturas() {
		return detfacturas;
	}

	public void setDetfacturas(List<DetalleFactura> detfacturas) {
		this.detfacturas = detfacturas;
	}

	public EstadoEnvio getEstadoenvio() {
		return estadoenvio;
	}

	public void setEstadoenvio(EstadoEnvio estadoenvio) {
		this.estadoenvio = estadoenvio;
	}

	public EstadoPago getEstadopago() {
		return estadopago;
	}

	public void setEstadopago(EstadoPago estadopago) {
		this.estadopago = estadopago;
	}

	

}
