package com.kd.springmvc.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Hotel {
	private String name;
	private String address;
	private final Chef chef;
}
