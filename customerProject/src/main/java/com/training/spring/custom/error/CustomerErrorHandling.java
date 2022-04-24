package com.training.spring.custom.error;

import java.util.ArrayList;
import java.util.List;

public class CustomerErrorHandling {

	private List<CustomerErrorHandling> subErrors;
	private String msg;
	private Integer exceptionCode;

	public List<CustomerErrorHandling> getSubErrors() {
		return subErrors;
	}

	public CustomerErrorHandling addSubErrors(CustomerErrorHandling obj) {
		if (this.subErrors == null)
			this.subErrors = new ArrayList<>();
		this.subErrors.add(obj);
		return this;

	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getMsg() {
		return msg;
	}

}
