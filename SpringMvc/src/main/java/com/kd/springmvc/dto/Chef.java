package com.kd.springmvc.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Chef {
	private String name;
	private String career;
	private String field;
}
