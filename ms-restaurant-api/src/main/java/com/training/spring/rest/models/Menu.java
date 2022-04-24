package com.training.spring.rest.models;

import java.util.List;

public class Menu {

	private Long personId;
	private List<Meal> meals;

	public List<Meal> getMeals() {
		return this.meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(final Long personIdParam) {
		this.personId = personIdParam;
	}

	@Override
	public String toString() {
		return "Menu [personId=" + this.personId + ", meals=" + this.meals + "]";
	}

}