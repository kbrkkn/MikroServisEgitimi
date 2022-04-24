package com.training.spring.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.training.spring.rest.models.Menu;
import com.training.spring.rest.models.MenuInfoPrice;

public interface IRestaurantMenuInfoController {
	@PostMapping("/api/v1/restaurant/menu/price")
	public MenuInfoPrice getMenuPrice(@RequestBody final Menu menu);
}
