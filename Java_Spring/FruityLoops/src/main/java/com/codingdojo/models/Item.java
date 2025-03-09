package com.codingdojo.models;


public class Item {

	public String name;
	public double price;
		
	public Item(String name, double price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	//Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Getters and Setters
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
