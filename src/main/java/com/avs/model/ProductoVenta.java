package com.avs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="producto_venta")
@IdClass(ProductoVentaPK.class)
public class ProductoVenta {
	
	@Id
	private Producto producto;
	
	@Id
	private Venta venta;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}
