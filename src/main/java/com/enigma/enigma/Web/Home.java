package com.enigma.enigma.Web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/home")
public class Home {
	@RequestMapping("/home")
	public String home() {
		return "home.jsp"; 
	}
}
