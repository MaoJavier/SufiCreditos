package com.sufi.app.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServicioClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioClientesApplication.class, args);
	}
}
