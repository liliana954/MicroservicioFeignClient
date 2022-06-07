package com.spring.boot.microservicio.act3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.microservicio.act3.modelo.Venta;
import com.spring.boot.microservicio.act3.service.VentaServiceFeign;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/venta ")
public class VentaController {
	
	@Autowired
	VentaServiceFeign service;
	
	@GetMapping
	@ApiOperation(value = "Obtiene productos de ventas")
	public ResponseEntity<List<Venta>> listarTodosLosProductos(){
		return ResponseEntity.ok(service.findAll());
	}
}
