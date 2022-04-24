package com.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NodeDiscoveryyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NodeDiscoveryyApplication.class, args);
	}

}
