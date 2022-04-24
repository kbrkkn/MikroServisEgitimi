package com.training.spring.customer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.customer.prop")
public class ApplicationConfig {
	private long maxListSize;
	private String language;
	private long pageSize;

	public long getMaxListSize() {
		return maxListSize;
	}

	public void setMaxListSize(long maxListSize) {
		this.maxListSize = maxListSize;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

}
