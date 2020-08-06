package com.jes.restfull.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FISCALIAS")
public class Fiscalia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nombre;	
	@Column
	private String departamento;
	@Column
	private String municipio;
	@Column
	private String direccion;
	@Column
	private String telefono;
	
	
	public Fiscalia() {
		super();
	}
	public Fiscalia(long id) {
		super();
		this.id = id;
	}
	public Fiscalia(long id, String nombre, String departamento, String municipio, String direccion, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
		this.municipio = municipio;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}
