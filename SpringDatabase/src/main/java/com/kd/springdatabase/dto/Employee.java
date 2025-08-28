package com.kd.springdatabase.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {
	
	Integer employee_id;
	String first_name;
	String last_name;
	String email;
	String phone_number;
	Date hire_date;
	String job_id;
	Integer salary;
	Integer commission_pct;
	Integer manager_id;
	Integer department_id;
}
