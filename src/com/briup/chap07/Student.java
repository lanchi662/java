
package com.briup.chap07;

public class Student implements Comparable {
	private String id;
	private String name;
	private double score;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Studnet [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	public int compareTo(Object o){
		
		if(o instanceof Student){
			Student stu=(Student)o;
		if(this.name=="tom"&&stu.getName()!="tom"){
			return -1;
		}
			else if(this.name!="tom"&&stu.getName()=="tom"){
				return 1;
			}
			double info=stu.getScore()-this.getScore();
		return (int) info;
		
		}
		return 0;
	}	
}
	


