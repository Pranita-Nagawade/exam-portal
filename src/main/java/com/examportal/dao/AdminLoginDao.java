package com.examportal.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.examportal.model.AdminLogin;

@Component
public class AdminLoginDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

//	@Transactional
//	public void addCredential(AdminLogin adminLogin) 
//	{
//		hibernateTemplate.save(adminLogin);
//		
//	}

	public List<AdminLogin> getCredentials() {
		return hibernateTemplate.loadAll(AdminLogin.class);
	}
}
