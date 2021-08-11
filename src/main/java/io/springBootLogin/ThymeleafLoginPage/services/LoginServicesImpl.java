package io.springBootLogin.ThymeleafLoginPage.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springBootLogin.ThymeleafLoginPage.dao.LoginDao;
import io.springBootLogin.ThymeleafLoginPage.entities.Logins;

@Service
public class LoginServicesImpl implements LoginServices {
	
	@Autowired
	private LoginDao loginDao;
	
//	private List<Logins> lists = new ArrayList<>( Arrays.asList(
//			new Logins("admin", "admin"),
//			new Logins("java", "java")
//			));

	@Override
	public boolean validate(String username, String password) {
		boolean a = loginDao.existsById(password) && loginDao.existsById(username);
		return a;
	}

}
