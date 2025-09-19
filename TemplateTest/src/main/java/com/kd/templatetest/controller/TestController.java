package com.kd.templatetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/test")
@Controller
public class TestController {
	@GetMapping("/sample/{id}")
	public String sample1(@PathVariable("id") Long id) {
		if(id == 1) {
			return "/staticWeb/product/car/영업용자동차보험전화";
		} else if(id == 2) {
			return "/staticWeb/product/car/영업용자동차보험인터넷";
		} else if(id == 3) {
			return "/staticWeb/product/car/자동차보험전화";
		} else if(id == 4) {
			return "/staticWeb/product/car/자동차보험인터넷";
		} else {
			return "/staticWeb/product/car/PP030101_001.html";
		}
	}
	@GetMapping("/sample2/{id}")
	public String sample2(@PathVariable("id") Long id) {
		if(id==1) {
			return "/staticWeb/product/car_discount/자동차보험인터넷";
		} else if(id==2) {
			return "/staticWeb/product/car_discount/자동차보험인터넷";
		} else if(id==3) {
			return "/staticWeb/product/car_discount/자동차보험인터넷";
		} else if(id==4) {
			return "/staticWeb/product/car_discount/Eco모빌리티";
		} else {
			return "redirect:/home";
		}
	}
}
