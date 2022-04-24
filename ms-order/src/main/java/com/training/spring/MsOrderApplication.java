package com.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import com.mikroservice.error.ErrorConfig;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Import(ErrorConfig.class)

public class MsOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOrderApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
