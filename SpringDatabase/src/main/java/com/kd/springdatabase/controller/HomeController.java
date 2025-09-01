package com.kd.springdatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@GetMapping(value = {"/index", "/home", "/"})
	public String index() {
		return "/index";
	}
}
