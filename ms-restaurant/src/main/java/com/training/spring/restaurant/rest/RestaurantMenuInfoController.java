package com.training.spring.restaurant.rest;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.web.bind.annotation.RestController;

import com.training.spring.rest.IRestaurantMenuInfoController;
import com.training.spring.rest.models.Menu;
import com.training.spring.rest.models.MenuInfoPrice;

@RestController
public class RestaurantMenuInfoController implements IRestaurantMenuInfoController{

	@Override
	public MenuInfoPrice getMenuPrice(Menu menu) {
		System.out.println("------MenuPrice : " + menu);
        MenuInfoPrice infoPriceLoc = new MenuInfoPrice();
        Random randomLoc = new SecureRandom();
        randomLoc.nextInt(500);
        infoPriceLoc.setPrice((long) randomLoc.nextInt(500));
        return infoPriceLoc;
	}

}
