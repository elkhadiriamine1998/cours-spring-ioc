package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.example.model.User;
import com.example.services.French;
import com.example.services.Language;


//permet de déclarer un composant configurant le context de l'application comme on a fait avec le bean 
@Configuration
@ComponentScan({"com.example.*"})// pour savoir ou on a déclarer l'annoation service , permet de préciser 
// dans quel package à scanner on  a des beans à injecte 
public class AppConfig {
	
	
	// un bean est un objet qui est instancie assemblé et géré
	// par la factory de Spring Core 
	@Bean(name = "user1")
	public User user1() {
		return new User(2, "Doe", "John", 2000);
	}
	
	
	@Bean(name = "language")
	public Language getLanguage() {
		return new French();
	}
	

}
