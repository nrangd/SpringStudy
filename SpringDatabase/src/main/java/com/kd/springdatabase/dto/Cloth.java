package com.kd.springdatabase.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Cloth {
	Integer cloth_id;
	String cloth_part;
	String cloth_brand;
	String cloth_size;
	Integer cloth_price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regist_date;
//	@DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm")
//	private Date regist_date2;
}
