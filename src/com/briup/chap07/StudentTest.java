package com.briup.chap07;
import java.util.TreeSet;
import java.util.Iterator;
public class StudentTest {

	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<Student>();
		Student stu1=new Student("112","tom",1);
		Student stu2=new Student("111","xan",90);
		Student stu3=new Student("113","si",100);
		Student stu4=new Student("114","hah",20);	
		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		Iterator<Student> i=ts.iterator();
		while(i.hasNext()){
			Object o=i.next();
			System.out.println("学生信息排序"+o);
		}
	
	}

}
