package com.briup.chap07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TeacherTest {

	public static void main(String[] args) {
		List<Teacher> list=new ArrayList<Teacher>();
		list.add(new Teacher("ÈÎ·É",20,"1111"));
		list.add(new Teacher("³Âëüëü",25,"1112"));
		list.add(new Teacher("ÍõÆ¼",23,"1114"));
		foreach(list);
		System.out.println("------------");
		Set<Teacher> set=new HashSet<Teacher>();
		set.add(new Teacher("ÈÎ·É",20,"1111"));
		set.add(new Teacher("ÈÎ·É",20,"1111"));
		set.add(new Teacher("³Âëüëü",25,"1112"));
		set.add(new Teacher("ÍõÆ¼",23,"1114"));
		foreach(set);
		A<String> a=new A<String>("jjjj","666");
		System.out.println(a);
	}
	public static void foreach(Collection c){
		Iterator<Teacher> iter=c.iterator();
		while(iter.hasNext()){
			Teacher t=iter.next();
			System.out.println(t);
		}
	}
	

}
class A <T>{
	private T name;
	private T sex;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(T name, T sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getSex() {
		return sex;
	}
	public void setSex(T sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", sex=" + sex + "]";
	}
	
}
