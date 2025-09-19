package com.kd.templatetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class MainContoller {
	@GetMapping(value = {"/","/home"})
	public String toHome() {
		return "/home";
	}
}
