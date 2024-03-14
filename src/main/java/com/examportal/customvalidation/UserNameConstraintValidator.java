package com.examportal.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserNameConstraintValidator implements ConstraintValidator<Username,String>
{
//	HibernateTemplate hibernateTemplate;
  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) 
  {
   
    
//    boolean result=value.equals(hibernateTemplate.get(value, 1));
	  boolean result=value.equals("admin");
    return result;
  }

}
