package com.kd.springmvc.dto;

public class Coffee {
	// * 필드의 변수명들이 파라미터의 name과 정확히 일치해야 한다
	private Integer coffee_id;
	private String coffee_name;
	private String coffee_bean;
	private String coffee_price;
	
	public Coffee() {};
	
	public Integer getCoffee_id() {
		return coffee_id;
	}

	public void setCoffee_id(Integer coffee_id) {
		this.coffee_id = coffee_id;
	}

	public String getCoffee_name() {
		return coffee_name;
	}
	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}
	public String getCoffee_bean() {
		return coffee_bean;
	}
	public void setCoffee_bean(String coffee_bean) {
		this.coffee_bean = coffee_bean;
	}
	public String getCoffee_price() {
		return coffee_price;
	}
	public void setCoffee_price(String coffee_price) {
		this.coffee_price = coffee_price;
	}

	@Override
	public String toString() {
		return "Coffee [coffee_id=" + coffee_id + ", coffee_name=" + coffee_name + ", coffee_bean=" + coffee_bean
				+ ", coffee_price=" + coffee_price + "]";
	}
	
}
