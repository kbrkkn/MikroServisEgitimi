package com.training.spring.integration.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.spring.integration.models.customer.CustomerRest;

@Service
public class CustomerClient {

	@Autowired
	RestTemplate restTemplate;

	public CustomerRest getPersonByPhoneNumber(String phone) {
		CustomerRest customer = restTemplate
				.getForObject("http://CUSTOMER/api/v1/customer/info/get/by/phone?phone=" + phone, CustomerRest.class);
		return customer;
	}

}
