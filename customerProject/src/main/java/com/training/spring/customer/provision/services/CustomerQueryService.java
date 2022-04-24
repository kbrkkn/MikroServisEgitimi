package com.training.spring.customer.provision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.customer.Customer;
import com.training.spring.customer.CustomerRest;
import com.training.spring.customer.provision.data.CustomerDataStorage;

@Service
public class CustomerQueryService {

	@Autowired
	private CustomerDataStorage customerDataStorage;

	public CustomerRest getByPhone(String phone) {

		Customer customer = customerDataStorage.getByPhone(phone);
		CustomerRest customerRest = new CustomerRest();
		customerRest.setName(customer.getName());
		customerRest.setSurname(customer.getSurname());
		customerRest.setUserName(customer.getUsername());
		customerRest.setPassword(customer.getPassword());
		customerRest.setBirthdate(customer.getBirthdate());
		customerRest.setHeight(customer.getHeight());
		customerRest.setWeight(customer.getWeight());
		customerRest.setPhone(customer.getPhone());

		return customerRest;
	}

}
