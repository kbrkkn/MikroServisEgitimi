package com.training.spring.order.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.integration.restaurant.RestaurantMenuClient;
import com.training.spring.order.rest.models.OrderRest;

@Service
public class OrderManagementService {
	@Autowired
	private RestaurantMenuClient restaurantMenuClient;

	public String place(final OrderRest param) {
		Long ucret = restaurantMenuClient.getPrice(param, 1L);
		return ucret + " TL";
	}
}
