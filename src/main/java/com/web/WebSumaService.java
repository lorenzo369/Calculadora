package com.web;

import static com.StaticFactoryBuilder.LOGGER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebSumaService {

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public WebSumaService(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
		LOGGER.trace(WebSumaService.class.getName());
	}

	public String sumar(String operando1, String operando2) {
		return restTemplate.getForObject(serviceUrl + "/sumar?operando1={operando1}&operando2={operando2}", String.class, operando1, operando2);
	}
}
