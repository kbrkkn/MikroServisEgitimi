package com.mikroservice.error;

public class RestException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private ErrorObj errorObj;

	public RestException() {
	}

	public RestException(ErrorObj errorObj) {
		this.errorObj = errorObj;
	}

	public ErrorObj getErrorObj() {
		return errorObj;
	}

	public void setErrorObj(ErrorObj errorObj) {
		this.errorObj = errorObj;
	}

}
