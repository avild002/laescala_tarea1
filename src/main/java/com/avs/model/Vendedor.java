package com.avs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idVendedor;
	
	@ManyToOne
	@JoinColumn(name="id_supervisor",nullable=false,foreignKey=@ForeignKey(name="FK_vendedor_supervisor"))
	private Supervisor supervisor;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="vendedor")
	private String vendedor;
	
	@Column(name="direccion_vendedor")
	private String direccionVendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getDireccionVendedor() {
		return direccionVendedor;
	}

	public void setDireccionVendedor(String direccionVendedor) {
		this.direccionVendedor = direccionVendedor;
	}

}
