package com.kd.springdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kd.springdatabase.dto.Cloth;
import com.kd.springdatabase.dto.Dog;
import com.kd.springdatabase.dto.mapper.ClothMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/cloth")
@Controller
public class ClothController {
	
	@Autowired
	private ClothMapper clothMapper;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("clothes", clothMapper.selectAll());
	}
	
	@GetMapping("/modify")
	public String modifyForm(@RequestParam Integer cloth_id, Model model) {
		// 수정하고자 한 한 행의 정보를 조회하여 들고가야 함
		model.addAttribute("cloth", clothMapper.get(cloth_id));
		
		return "/cloth/modify_form";
	}
	
	@PostMapping("/modify")
	public String modify(Cloth cloth) throws Exception {
		int result = clothMapper.update(cloth);
		
		if (result > 0) {
			return "redirect:/cloth/list";
		} else {
			throw new Exception("수정 실패");
		}
		
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam Integer cloth_id) throws Exception {
		log.info("이제 {}번 상품을 삭제해야 합니다!", cloth_id);
		
		int result = clothMapper.delete(cloth_id);
		
		if(result > 0) {
			log.info("{}번 상품 삭제 완료!", cloth_id);
			return "redirect:/cloth/list";
		} else {
			throw new Exception("삭제 실패");
		}
	}
	
	@GetMapping("/insert")
	public String insertForm(Model model) {
		model.addAttribute("sizes", new String[] {"XXL", "XL", "L", "M", "S"});
		
		return "/cloth/add_form";
	}
	
	@PostMapping("/insert")
	public String insert(Cloth cloth) throws Exception {
		int result = clothMapper.insert(cloth);
		
		if(result > 0) {
			log.info("행 추가 성공 : {}", result);
			return "redirect:/cloth/list";
		} else {
			throw new Exception("행 추가 실패");
		}
		
	}
	
	@PostMapping("/insert2")
	public String insert2(Cloth cloth) throws Exception {
		Cloth dto = clothMapper.insert2(cloth);
		
		if(dto != null) {
			log.info("방금 추가한 행의 키 : {}", dto.getCloth_id());
			return "redirect:/cloth/list";
		} else {
			throw new Exception("행 추가 실패");
		}
	}
	
	@PostMapping("/timetest")
	public String timetest(
			@RequestParam String regist_date,
			@RequestParam String regist_date2
			) {
		log.info("regist date(type=date): {}", regist_date);
		log.info("regist date2(type=datetime-local): {}", regist_date2);
		
		return "redirect:/cloth/list";
	}
	
	@PostMapping("/timetest2")
	public String timetest(Dog dog) {
		log.info("dog's regist date(type=date): {}", dog.getRegist_date());
		log.info("dog's regist date2(type=datetime-local): {}", dog.getRegist_date2());
		
		return "redirect:/cloth/list";
	}
}
