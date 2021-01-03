package com.tienda.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "Detalle_Factura")
@Entity
public class DetalleFactura implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_detalle")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idDet;

	@Column(name = "cantidad")
	private Integer cantidad;

	@Column(name = "subtotal")
	private Double subtotal;

	@JoinColumn(name = "fk_cabfactura", referencedColumnName = "id_cfactura")
	@ManyToOne
	private CabFactura cabfactura;

	@JoinColumn(name = "fk_producto", referencedColumnName = "id_product")
	@ManyToOne
	private Product producto;

	public DetalleFactura() {

	}

	public DetalleFactura(Long id) {

		this.idDet = id;
	}

	public Long getIdDet() {
		return idDet;
	}

	public void setIdDet(Long idDet) {
		this.idDet = idDet;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public CabFactura getCabfactura() {
		return cabfactura;
	}

	public void setCabfactura(CabFactura cabfactura) {
		this.cabfactura = cabfactura;
	}

	public Product getProducto() {
		return producto;
	}

	public void setProducto(Product producto) {
		this.producto = producto;
	}
	
	

}
