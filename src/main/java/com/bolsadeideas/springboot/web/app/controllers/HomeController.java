package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "forward:/app/index"; //redirect redirige, forward no cambia la ruta (no se puede hacer a paginas externas)
	}

}
