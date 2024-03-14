package com.examportal.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String> {
	@Override
	// @RequestMapping(path = "/adminLoginSubmit", method = RequestMethod.POST)

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		boolean result = value.equals("admin123");
		return result;
	}
}
