package com.rest.resta;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class RestaServer {
	protected Logger logger = Logger.getLogger(RestaServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "resta-server");

		SpringApplication.run(RestaServer.class, args);
	}
}
