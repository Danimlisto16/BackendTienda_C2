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

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "Client")

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrementable
	@Column(name = "id_client")
	@Basic(optional = false)
	private long idclient;

	@Column(name = "document", length = 30)
	private String document;

	@Column(name = "firstname", length = 30)
	private String firstname;

	@Column(name = "lastname", length = 30)
	private String lastname;

	@Column(name = "cellphone", length = 30)
	private String cellphone;

	@Column(name = "email", length = 30)
	private String email;

	@Column(name = "address", length = 30)
	private String address;

	@Column(name = "borndate", length = 30)
	private String borndate;

	@Column(name = "user", length = 30)
	private String user;

	@Column(name = "password", length = 30)
	private String password;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<CabFactura> cabfacturas;

	public Client() {
		super();
	}

	public Client(long id) {
		super();
		this.idclient = id;

	}

	public long getIdclient() {
		return idclient;
	}

	public void setIdclient(long idclient) {
		this.idclient = idclient;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBorndate() {
		return borndate;
	}

	public void setBorndate(String borndate) {
		this.borndate = borndate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<CabFactura> getCabfacturas() {
		return cabfacturas;
	}

	public void setCabfacturas(List<CabFactura> cabfacturas) {
		this.cabfacturas = cabfacturas;
	}

}