package com.training.spring.custom.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartsWithCheckImpl implements ConstraintValidator<StartsWith, String> {

	private StartsWith constraintAnnotation;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.startsWith(constraintAnnotation.value());
	}

	@Override
	public void initialize(StartsWith constraintAnnotation) {
		this.constraintAnnotation = constraintAnnotation;
	}

}
