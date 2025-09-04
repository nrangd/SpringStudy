package com.kd.logintest.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kd.logintest.dto.LoginDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/login")
@Controller
public class LoginController {
	@GetMapping("/")
	public String login() {
		return "/login/loginPage";
	}
	
	@ResponseBody
	@PostMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public String loginTest(@RequestBody LoginDto login, HttpServletRequest request) {
		
		if(login.getLogin_id().equals("abc") && login.getLogin_password().equals("123")) {
			log.info("로그인성공");
			HttpSession session = request.getSession();
			session.setAttribute("login", true);
			session.setAttribute("id", login.getLogin_id());
			
			return "{\"r\" : \"s\"}";
		} else {
			log.info("로그인 실패");
			return "{\"r\" : \"f\"}";
		}
	}
	
	@GetMapping("/success")
	public String success() {
		log.info("로그인 성공 페이지");
		return "/login/success";
	}
}
