package com.training.spring.customer.provision.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.training.spring.customer.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long> {

	List<Customer> findBySurname(String name);

	Customer findByPhone(String phone);

}
