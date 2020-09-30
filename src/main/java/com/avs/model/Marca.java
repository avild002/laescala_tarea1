package com.avs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.Size;

@Entity
@Table(name="marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	
	@Size(min=10, message="Descripción debe tener mínimo 10 caracteres")
	@Column(name="descripcion",nullable=true,length=150)
	private String descripcion;
	
	@Size(min=10,message="Dirección debe tener mínimo 10 caracteres")
	@Column(name="direccion",nullable=true,length=50)
	private String direccion;
	
	@Size(min=3,message="Ciudad debe contener mínimo 3 caracteres")
	@Column(name="ciudad",nullable=true,length=20)
	private String ciudad;

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
