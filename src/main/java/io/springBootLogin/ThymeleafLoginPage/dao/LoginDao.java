package io.springBootLogin.ThymeleafLoginPage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springBootLogin.ThymeleafLoginPage.entities.Logins;

public interface LoginDao extends JpaRepository<Logins, String>{

}
