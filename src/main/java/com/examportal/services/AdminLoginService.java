package com.examportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.examportal.dao.AdminLoginDao;
import com.examportal.model.AdminLogin;

@Component
@Service
public class AdminLoginService {
	@Autowired
	AdminLoginDao adminLoginDao;

//	public void addCredential(AdminLogin adminLogin)
//	{
//		adminLoginDao.addCredential(adminLogin);
//	}

	public void adminLoginValidation(AdminLogin adminLogin) {
		List<AdminLogin> loginList = adminLoginDao.getCredentials();

		for (AdminLogin adminLogin2 : loginList) {
			System.out.println(adminLogin2);
		}
	}
}
