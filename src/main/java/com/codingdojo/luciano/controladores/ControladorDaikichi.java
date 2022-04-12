package com.codingdojo.luciano.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {
	@RequestMapping("/daikichi")
	public String saludo() {
		return "!Bienvenido!";
	}
	
	@RequestMapping("/daikichi/today")
	public String daikichi() {
		return "Hoy encontrarás suerte en todos tus esfuerzos";
	}
}
