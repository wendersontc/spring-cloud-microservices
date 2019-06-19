package com.microservices.pedidosmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PedidosMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosMicroserviceApplication.class, args);
	}

}
