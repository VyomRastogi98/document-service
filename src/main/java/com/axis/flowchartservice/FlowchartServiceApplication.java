package com.axis.flowchartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FlowchartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowchartServiceApplication.class, args);
	}

}
