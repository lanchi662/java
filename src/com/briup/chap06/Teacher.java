package com.briup.chap06;

public class Teacher {
	private String id;
	private String name;
	private int age;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public boolean equals(Object o){
		if(o instanceof Teacher){
		Teacher t=(Teacher)o;
		 if(this.id.equals(id)&&this.name.equals(name)&&this.age==age){
			return true;
			
		}else{
			return false;
		}
		}
		 else{
			return false;
		}
		
	}
}
