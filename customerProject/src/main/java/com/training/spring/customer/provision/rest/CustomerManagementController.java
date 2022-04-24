package com.training.spring.customer.provision.rest;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.customer.Customer;
import com.training.spring.customer.CustomerRest;

@RestController
@Validated
@RequestMapping("/api/v1/customer/management")
public class CustomerManagementController {

	@PostMapping("/update")
	public String update(@RequestBody CustomerRest customer) {
		return "OK";
	}

	@PutMapping("/backup")
	public String backup(@RequestBody CustomerRest customer) {
		return "OK";
	}
}
