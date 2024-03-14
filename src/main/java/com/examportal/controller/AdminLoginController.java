package com.examportal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examportal.model.AdminLogin;
import com.examportal.services.AdminLoginService;

@Controller
@RequestMapping
public class AdminLoginController {
	@Autowired
	AdminLoginService adminLoginService;

//		@PostMapping("/adminLoginSubmit")
//		public String hadleForm(@ModelAttribute("adminLoginSubmit") AdminLogin adminLogin)
//		{
//			adminLoginService.addCredential(adminLogin);
//			 return "home";
//		}

	@RequestMapping(value = "/adminLoginSubmit", method = RequestMethod.POST)
	public String validation(@Valid @ModelAttribute("adminLoginSubmit") AdminLogin adminLogin, BindingResult br) {
		if (br.hasErrors()) {
			return "errorpage";
		} else {
			return "home";
		}
	}
	
	
}
