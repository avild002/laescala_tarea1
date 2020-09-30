package com.avs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supervisor")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idSupervisor;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="supervisor")
	private String supervisor;
	
	@Column(name="direccion_supervisor")
	private String direccionSupervisor;
	
	@Column(name="telefono_supervisor")
	private String telefonoSupervisor;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getDireccionSupervisor() {
		return direccionSupervisor;
	}

	public void setDireccionSupervisor(String direccionSupervisor) {
		this.direccionSupervisor = direccionSupervisor;
	}

	public String getTelefonoSupervisor() {
		return telefonoSupervisor;
	}

	public void setTelefonoSupervisor(String telefonoSupervisor) {
		this.telefonoSupervisor = telefonoSupervisor;
	}
	
	

}
