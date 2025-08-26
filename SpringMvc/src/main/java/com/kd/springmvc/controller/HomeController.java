package com.kd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String index(HttpServletRequest request) {
		request.setAttribute("snack", "포카칩");
		return "index";
	}
	
}
