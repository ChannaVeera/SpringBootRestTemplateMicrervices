package com.helloclient.helloclient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RestTemplateConfig {
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		System.out.println("restTemplateClass");
		return new RestTemplate();
	}
}
