package com.mikroservice.error;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.info")
public class AppInfo {
	private String boundedContext;
	private String domain;
	private String microservice;

	public String getBoundedContext() {
		return boundedContext;
	}

	public void setBoundedContext(String boundedContext) {
		this.boundedContext = boundedContext;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getMicroservice() {
		return microservice;
	}

	public void setMicroservice(String microservice) {
		this.microservice = microservice;
	}

}
