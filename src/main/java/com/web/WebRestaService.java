package com.web;

import static com.StaticFactoryBuilder.LOGGER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebRestaService {
	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public WebRestaService(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
		LOGGER.trace(WebRestaService.class.getName());
	}
	
	public String restar(String restador1, String restador2) {
		return restTemplate.getForObject(serviceUrl + "/restar?restador1={restador1}&restador2={restador2}", String.class, restador1, restador2);
	}
}
