package com.training.spring.customer;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.training.spring.custom.validation.StartsWith;

public class CustomerRest {

	@NotEmpty
	@Size(min = 3, max = 100, message = "not valid name")
	@JsonProperty("name")
	@StartsWith("K")
	private String name;

	@NotEmpty
	@Size(min = 3, max = 100, message = "not valid name")
	@JsonProperty("surname")
	@StartsWith("A")
	private String surname;

	@NotEmpty
	@Size(min = 3, max = 100, message = "not valid name")
	@JsonProperty("username")
	@StartsWith("N")
	private String username;

	@NotEmpty
	@Size(min = 8, max = 15, message = "not valid pw")
	@JsonProperty("password")
	private String password;

	@DateTimeFormat
	@JsonProperty("birthdate")
	private String birthdate;

	@Max(200)
	@JsonProperty("height")
	private int height;

	@Max(100)
	@JsonProperty("weight")
	private int weight;

	private String phone;

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

	public String getUsername() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
