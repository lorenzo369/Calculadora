package com.rest.suma;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class SumaServer {

	protected Logger logger = Logger.getLogger(SumaServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "suma-server");

		SpringApplication.run(SumaServer.class, args);
	}
}
