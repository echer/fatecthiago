package com.fatec.projetoweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poi")
public class PontoDeInteresseController {
	
	@GetMapping
	public String heartBeat() {
		return "hello from poi!";
	}

}
