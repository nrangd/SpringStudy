package com.kd.springdatabase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Fruit {
	private Integer fid;
	private String fname;
	private Integer fprice;
	private String farm;
}
