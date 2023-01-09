package com.example.services;

import java.io.Serial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="greetingService") // Injecte un bean de type service dans la factory de spring core 
public class GreetingService {
	
	// recupère un bean injecte avec Autowired dans la classe AppConfig
	@Autowired	
	private Language language;
	
	public GreetingService() {
		
	}
	
	public void sayHello() {
		System.err.println("Message : " + language.getHello());
	}
	

}
