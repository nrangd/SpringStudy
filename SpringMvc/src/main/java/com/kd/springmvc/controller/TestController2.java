package com.kd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kd.springmvc.dto.Coffee;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController2 {
	
	@GetMapping("/coffee/add")
	public String coffeeAdd() {
		return "/coffee/coffeeAddForm";
	}
	
	@PostMapping("/coffee/add")
	public String add(HttpServletRequest request) {
		String coffee_name = request.getParameter("coffee_name");
		String coffee_bean = request.getParameter("coffee_bean");
		String coffee_price = request.getParameter("coffee_price");
		
		System.out.println("coffee_name:" + coffee_name);
		System.out.println("coffee_bean:" + coffee_bean);
		System.out.println("coffee_price:" + coffee_price);
		return "redirect:/coffee/add";
	}
	
	// 해당 파라미터를 필드로 갖는 모델 객체를 매개변수로 활용하면
	// 파라미터에 있는 값을 활용하여 자동으로 만들어진 인스턴스가 전달된다
	// (파라미터 값의 타입도 알아서 변환해준다)
	
	@PostMapping("/coffee/add2")
	public String add2(Coffee coffee, Model model) {
		System.out.println("coffee to add: " + coffee);
		
		// DB에 추가를 잘하고 ID를 얻어온거로 가정...
		coffee.setCoffee_id(138);
		
		// 값을 다음 페이지로 실어보낼때는 어트리뷰트가 아니라 모델 객체를 사용하는 것이 바람직하다
		model.addAttribute("coffee", coffee);
		model.addAttribute("result", "failed");
//		request.setAttribute("coffee", coffee);
//		request.setAttribute("result", "success");
		
		return "/coffee/add_result";
	}
	
	
	// @RequestParam 어노테이션을 활용해 매개 벼수에 파라미터 값을 바인딩하는 방법도 있다
	@PostMapping("/coffee/add3")
	public String add3(
			@RequestParam("coffee_name") String coffee_name, 
			@RequestParam("coffee_bean") String coffee_bean, 
			@RequestParam("coffee_price") Integer coffee_price) {
		System.out.println("coffee_name: " + coffee_name);
		System.out.println("coffee_bean: " + coffee_bean);
		System.out.println("coffee_price: " + coffee_price);
		
		return "redirect:/coffee/add";
	}

}
