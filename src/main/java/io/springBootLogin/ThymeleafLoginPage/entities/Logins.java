package io.springBootLogin.ThymeleafLoginPage.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logins {
	
	@Id
	private String username;
	private String password;

	public Logins() {
		
	}

	public Logins(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
