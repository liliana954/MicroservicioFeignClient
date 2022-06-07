package com.spring.boot.microservicio.act3.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.spring.boot.microservicio.act3.cliente.VentaFeignCliente;
import com.spring.boot.microservicio.act3.modelo.Venta;

@Service
@Primary
public class VentaServiceFeign implements IVentaService{
	
	@Autowired
	private VentaFeignCliente clienteFeign;
	
	@Override
	public List<Venta> findAll() {
		return (List<Venta>)clienteFeign.listarProductos();
	}
}
