package com.rest.resta;

import static com.StaticFactoryBuilder.LOGGER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class RestaServer {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "resta-server");

		SpringApplication.run(RestaServer.class,args);
		LOGGER.trace(RestaServer.class.getName());
	}
}
