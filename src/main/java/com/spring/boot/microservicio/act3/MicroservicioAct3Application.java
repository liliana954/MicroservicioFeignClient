package com.spring.boot.microservicio.act3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroservicioAct3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAct3Application.class, args);
	}

}
