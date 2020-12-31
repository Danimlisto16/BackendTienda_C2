package com.tienda.backend.models.entities;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Importar para las listas
import java.util.List;


@Table(name = "Product_category") //Por seguir un estandar , tablas en bd son en plural

@Entity //Decorador que crea la tabla en la bd

public class Product_category implements Serializable {
	
private static final long serialVersionUID = 1L; //es el identificador cuando se enviar datos a través de la red
	
	//Atributos de la clase
	@Id  	//Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //Autoincrementable
	@Column(name = "id_category")
	@Basic (optional = false)
	private long idcategory;
	
	@Column(name = "nombre", length = 30)
	private String nombre;
	
	
	
	//cardinalidad 1 a varios - 1 categoria en muchos productos
	@OneToMany(mappedBy = "product_category",fetch = FetchType.LAZY)
	private List<Product> products;
	
	//constructor
	
	public Product_category() {
		super();
	}
	
	public Product_category(long id) {
		super();
		this.idcategory = id;
	}
	
	//getter & setter

	public long getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(long idcategory) {
		this.idcategory = idcategory;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
		
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	

}