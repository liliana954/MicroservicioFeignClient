package com.spring.boot.microservicio.act3.cliente;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.boot.microservicio.act3.modelo.Venta;

@FeignClient(name = "servicios-producto", url="http://localhost:8080")
public interface VentaFeignCliente {
	
	@GetMapping ("/api/producto")
	public List<Venta> listarProductos();
}
