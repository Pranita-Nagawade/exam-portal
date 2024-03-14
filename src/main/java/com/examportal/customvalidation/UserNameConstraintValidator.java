package com.examportal.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserNameConstraintValidator implements ConstraintValidator<Username,String> {

  @Override
  //@RequestMapping(path = "/adminLoginSubmit", method = RequestMethod.POST) 

  public boolean isValid(String value, ConstraintValidatorContext context) {
    // TODO Auto-generated method stub
    
    boolean result=value.equals("admin");
    return result;
  }

}
