package com.training.spring.order.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.order.rest.models.OrderRest;
import com.training.spring.order.rest.services.OrderManagementService;

@RestController
@RequestMapping("api/v1/order/management")
public class OrderManagementController {

	@Autowired
	OrderManagementService orderManagementService;

	@PostMapping("/place")
	public String place(@RequestBody final OrderRest orderRest) {
		return orderManagementService.place(orderRest);
	}
}
