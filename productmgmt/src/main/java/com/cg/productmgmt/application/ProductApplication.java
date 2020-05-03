package com.cg.productmgmt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);

	}
	    @Bean
	    @LoadBalanced
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }

}
