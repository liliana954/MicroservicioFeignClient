package com.spring.boot.microservicio.act3.service;

import java.util.List;

import com.spring.boot.microservicio.act3.modelo.Venta;

public interface IVentaService {
	public List<Venta> findAll();
}
