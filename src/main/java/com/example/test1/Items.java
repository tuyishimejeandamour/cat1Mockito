package com.example.test1;

public class Items {
	
	private double total;
	private String name;
	private double price;
	
	
	public Items(String name, double price) {
		this.total = 0;
		this.name = name;
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total2) {
		this.total = total2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double total2) {
		this.price = total2;
	}
	
	

}
