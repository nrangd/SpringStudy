package com.kd.templatetest.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kd.templatetest.vo.part.Section;

@RequestMapping("/mall")
@Controller
public class HealthController {
	
	@GetMapping("/dental")
	public String dental(Model model) {
		ArrayList<Section> sections = new ArrayList<>();
		sections.add(
				new Section("때우고 씌우는 충치치료를 꼼꼼하게 보장!", 
						new String[] {"충치 또는 잇몸질환 등으로 인한 치아보존 치료비 보장",
								"금, 세라믹 등 재료에 상관없이, 치아 개수도 제한없이 보장 가능"}, 
						null));
		sections.add(
				new Section("다양한 할인 특약으로 보험료 할인",
						new String[] {"마일리지, 블랙박스, 자녀사랑 할인 특약 등 가입으로 보험료 할인"
								+ "※특약별 가입대상 및 조건에 대한 자세한 내용은 각 특약 상세 페이지에서 확인 가능",
								"최근 3년 이상 무사고 시 보험료 할인(조건 해당 시, 별도 가입 절차 없이 자동 가입)최근 3년 이상 무사고 시 보험료 할인(조건 해당 시, 별도 가입 절차 없이 자동 가입)"}, 
						null));
		sections.add(
				new Section("title3",
						new String[] {"믿을 수 있는 삼성화재 보상서비스는 그대로",
								"인터넷으로 가입해도 삼성화재 보상서비스는 동일하게 제공",
								"365일 24시간 신속한 현장출동서비스 제공"}, 
						new String[] {"애니카서비스 특약 가입 시 신속한 긴급출동서비스를 제공합니다.",
								"삼성화재가 인증한 애니카 패밀리센터에서 수리 시 품질보증서비스를 제공합니다.",
								"외제차 고객님의 경우, 외제차 안심케어센터에서 예상 견적 산출, 보상 상담, 간편 수리까지 모든 과정을 지원합니다."}));

		model.addAttribute("sections", sections);
		
		return "/staticWeb/product/health/PP030402_001";
	}
}
