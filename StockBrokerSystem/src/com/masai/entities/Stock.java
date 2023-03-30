package com.masai.entities;

import java.io.Serializable;

public class Stock implements Serializable{
	private int id;
	private String name;
	private int qty;
	private double price;
	private String category;
	
	
	
	
	public Stock() {
		super();
	}




	public Stock(int id, String name, int qty, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.category = category;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getQty() {
		return qty;
	}




	public void setQty(int qty) {
		this.qty = qty;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
