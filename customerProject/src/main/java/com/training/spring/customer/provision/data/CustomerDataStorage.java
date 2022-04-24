package com.training.spring.customer.provision.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.customer.Customer;
import com.training.spring.customer.provision.persist.ICustomerDao;

@Service
public class CustomerDataStorage {

	@Autowired
	ICustomerDao personDao;

	public Long insert(Customer customer) {
		Customer saveLoc = personDao.save(customer);
		return saveLoc.getId();
	}

	public void delete(long id) {
		personDao.deleteById(id);
	}

	public void update(Customer customer) {
		personDao.save(customer);
	}

	public Customer getOne(long id) {
		return personDao.findById(id).orElse(null);
	}

	public List<Customer> getAll() {
		List<Customer> cList = new ArrayList<>();
		Iterable<Customer> allList = personDao.findAll();
		for (Customer customer : allList) {
			cList.add(customer);
		}
		return cList;
	}

	public List<Customer> getByName(String name) {
		return personDao.findBySurname(name);
	}

	public Customer getByPhone(String phone) {
		return personDao.findByPhone(phone);
	}
}
