package com.training.spring.customer.provision.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.customer.CustomerRest;
import com.training.spring.customer.provision.services.CustomerQueryService;

@RestController
@RequestMapping("/api/v1/customer/info")
public class CustomerInfoQuery {

	@Autowired
	CustomerQueryService customerQueryService;

	@GetMapping("/get/by/phone")
	public CustomerRest getByPhone(@RequestParam String phone) {

		return customerQueryService.getByPhone(phone);
	}

	@GetMapping("/get/by/surname")
	public CustomerRest GetBySurname(@RequestParam String surname) {
		return null;
	}

	@GetMapping("/get/single")
	public CustomerRest getSingle(@RequestParam long id) {
		return null;
	}

	@GetMapping("/get/all")
	public List<CustomerRest> getAll() {
		return null;
	}

	@GetMapping("/get/by/name")
	public CustomerRest getByName(@RequestParam String name) {
		return null;
	}

}
