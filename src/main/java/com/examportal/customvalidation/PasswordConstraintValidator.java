package com.examportal.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String> {
	
	HibernateTemplate hibernateTemplate;
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) //this value is came from frontend
	{
		

		boolean result = value.equals("admin123");
		return result;
	}
}
