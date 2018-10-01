package com.briup.xml;

public class records {
	private String name;
	private double price;
	public records() {
		super();
		// TODO Auto-generated constructor stub
	}
	public records(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "records [name=" + name + ", price=" + price + "]";
	}
	

}
