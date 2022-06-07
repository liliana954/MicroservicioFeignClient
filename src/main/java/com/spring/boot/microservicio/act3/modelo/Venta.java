package com.spring.boot.microservicio.act3.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venta {

	@Id
	private Long id;
	
	private String nombre_producto;
	private String beneficios;	
	
	public Venta() {
		super();
	}

	public Venta(String nombre_producto, String beneficios) {
		super();
		
		this.nombre_producto = nombre_producto;
		this.beneficios = beneficios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
}
