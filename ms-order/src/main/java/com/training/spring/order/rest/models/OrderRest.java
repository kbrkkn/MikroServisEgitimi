package com.training.spring.order.rest.models;

import java.util.List;

import com.training.spring.rest.models.Meal;

public class OrderRest {
	private String phone;
	private String name;
	private String surname;
	private List<Meal> meals;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

}
