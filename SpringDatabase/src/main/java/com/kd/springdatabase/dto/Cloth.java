package com.kd.springdatabase.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Cloth {
	private Integer cloth_id;
	private String cloth_part;
	private String cloth_brand;
	private String cloth_size;
	private Integer cloth_price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regist_date;
//	@DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm")
//	private Date regist_date2;
}
