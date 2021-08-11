package io.springBootLogin.ThymeleafLoginPage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springBootLogin.ThymeleafLoginPage.form.LoginForm;
import io.springBootLogin.ThymeleafLoginPage.services.LoginServices;

@Controller
public class LoginController {
	
	@Autowired
    private LoginServices loginServices;
    
	//to get Login Page
	@RequestMapping(method = RequestMethod.GET, value="/login")
	public String getLoginForm() {
		return "login";
	}
	
	//checking Login Credentials
	@RequestMapping(method = RequestMethod.POST, value="/login")
	public String login(@ModelAttribute(name="loginform") LoginForm loginForm, Model model) {
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		boolean a = loginServices.validate(username, password);
		
		if(a == true) {
			return "home";
		}
		model.addAttribute("invalidCredentials",true);
		return "login";
	}

}
