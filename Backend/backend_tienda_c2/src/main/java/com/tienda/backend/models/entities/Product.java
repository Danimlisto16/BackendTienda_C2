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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Product") // Por seguir un estandar , tablas en bd son en plural

@Entity // Decorador que crea la tabla en la bd

public class Product implements Serializable { // Serializable permite enviar datos a través de la red

	private static final long serialVersionUID = 1L; // es el identificador cuando se enviar datos a través de la red

	// Atributos de la clase
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrementable
	@Column(name = "id_product")
	@Basic(optional = false)
	private long idproduct;

	@Column(name = "nombre", length = 30)
	private String nombre;

	@Column(name = "precio")
	private double precio;

	@Column(name = "stock")
	private int stock;

	@Column(name = "imagenUrl", length = 300)
	private String imagenUrl;

	@JoinColumn(name = "fk_product_category", referencedColumnName = "id_category")
	@ManyToOne
	private Product_category product_category;

	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	private List<DetalleFactura> detfacturas;

	// Constructor
	public Product() {
		super();
	}

	public Product(long id) {
		super();
		this.idproduct = id;

	}

	public long getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(long idproduct) {
		this.idproduct = idproduct;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

	public Product_category getProduct_category() {
		return product_category;
	}

	public void setProduct_category(Product_category product_category) {
		this.product_category = product_category;
	}

	public List<DetalleFactura> getDetfacturas() {
		return detfacturas;
	}

	public void setDetfacturas(List<DetalleFactura> detfacturas) {
		this.detfacturas = detfacturas;
	}

	// getter&setter

}
