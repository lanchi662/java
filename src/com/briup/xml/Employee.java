package com.briup.xml;

public class Employee {
	private String name;
	private double user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUser() {
		return user;
	}
	public void setUser(double user) {
		this.user = user;
	}
	public Employee(String name, double user) {
		super();
		this.name = name;
		this.user = user;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", user=" + user + "]";
	}

}
