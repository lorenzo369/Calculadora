package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class WebServer {

	public static final String SUMA_SERVICE_URL = "http://suma-service";

	public static final String RESTA_SERVICE_URL = "http://resta-service";

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "web-server");
		SpringApplication.run(WebServer.class, args);
	}

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebSumaService sumaService() {
		return new WebSumaService(SUMA_SERVICE_URL);
	}

	@Bean
	public WebCalculoController sumaController() {
		return new WebCalculoController(sumaService(), restaService());
	}

	@Bean
	public WebRestaService restaService() {
		return new WebRestaService(RESTA_SERVICE_URL);
	}

	@Bean
	public HomeController homeController() {
		return new HomeController();
	}
}