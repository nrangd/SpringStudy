package com.kd.logintest.controller;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kd.logintest.dto.LoginDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
	public ResponseEntity<String> loginTest(@RequestBody LoginDto login, HttpServletResponse response) {
		try {
			response.sendRedirect("/succcess");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 받은 Login 객체에 들어있는 id와 password값으로 
		// db와 연동해서 로그인 체크를 한다
		
		if(login.getLogin_id().equals("123")) {
			log.info("로그인성공?");
			
			return ResponseEntity.status(200).contentType(MediaType.TEXT_HTML).body(
					"<div>" + 
					login.getLogin_id() + 
					"님 환영합니다</div>");
		} else {
			return ResponseEntity.status(404).body("로그인 실패");
		}
	}
	
	@GetMapping("/success")
	public String success() {
		log.info("성공?");
		return "/login/success";
	}
}
