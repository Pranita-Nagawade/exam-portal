package com.examportal.model;

import javax.persistence.Entity;

import javax.persistence.Id;

import com.examportal.customvalidation.Password;
import com.examportal.customvalidation.Username;

import lombok.Data;

@Entity
@Data
public class AdminLogin {

	@Id
	@Username
	private String adminUserName;
	@Password
	private String adminPassword;

}
