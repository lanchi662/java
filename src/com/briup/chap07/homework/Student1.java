package com.briup.chap07.homework;

import java.util.Date;

public class Student1 extends AutoInvoke{
	private String name;
    private Integer age;
    private java.util.Date birthday;
    private String address;
    private String email;
    private String phone;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, Integer age, Date birthday, String address, String email, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public java.util.Date getBirthday() {
		return birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", birthday=" + birthday + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	
    
}
