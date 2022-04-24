package com.mikroservice.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorObj {
	private List<ErrorObj> subErrors;
	private String message;
	private Integer errorCode;
	private String boundedContext;
	private String domain;
	private String microservice;

	public static ErrorObj newInstance() {
		return new ErrorObj();
	}

	public ErrorObj addSubError(ErrorObj err) {
		if (this.subErrors == null) {
			this.subErrors = new ArrayList<>();
		}
		this.subErrors.add(err);
		return this;
	}

	public List<ErrorObj> getSubErrors() {
		return subErrors;
	}

	public ErrorObj setSubErrors(List<ErrorObj> subErrors) {
		this.subErrors = subErrors;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ErrorObj setMessage(String message) {
		this.message = message;
		return this;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public ErrorObj setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	public String getBoundedContext() {
		return boundedContext;
	}

	public ErrorObj setBoundedContext(String boundedContext) {
		this.boundedContext = boundedContext;
		return this;
	}

	public String getDomain() {
		return domain;
	}

	public ErrorObj setDomain(String domain) {
		this.domain = domain;
		return this;
	}

	public String getMicroservice() {
		return microservice;
	}

	public ErrorObj setMicroservice(String microservice) {
		this.microservice = microservice;
		return this;
	}

}
