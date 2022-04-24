package com.training.spring.customer.provision.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.customer.CustomerRest;

@RestController
@Validated //@RequestParam için
@RequestMapping("/api/v1/customer/provision")
public class CustomerProvisionController {

	@PostMapping("/add")
	public ResponseEntity<String> add(@Validated @RequestBody CustomerRest customer) {//DTO'lardaki alanların kontrolu için
		return ResponseEntity.status(200).body("OK");
	}

	@PutMapping("/activate")
	public String activate(@RequestParam long id) {
		return "OK";
	}

	@PostMapping("/deactivate")
	public String deactivate(@RequestParam long id) {
		return "OK";
	}
}
