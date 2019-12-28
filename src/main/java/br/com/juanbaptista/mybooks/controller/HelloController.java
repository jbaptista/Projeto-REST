package br.com.juanbaptista.mybooks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String hello() {
		return "Endpoint funcionando";
	}
}
