package com.rest.suma;

import static com.StaticFactoryBuilder.LOGGER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class SumaServer {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "suma-server");

		SpringApplication.run(SumaServer.class,args);
		
		LOGGER.trace(SumaServer.class);
	}
}
