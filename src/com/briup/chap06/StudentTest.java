package com.briup.chap06;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		List list=new ArrayList();
		Student stu1=new Student("1617700146","啦啦",20,100);
		Student stu2=new Student("1617700147","哈哈",20,100);
		Student stu3=new Student("1617700148","呵呵",20,100);
		Student stu4=new Student("1617700149","哦哦",20,100);
		Student stu5=new Student("1617700150","嘿嘿",20,100);
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		Iterator iter=list.iterator();
		for(int i=0;i<list.size();i++){
			Object o=list.get(i);
			System.out.println("学生信息="+o);
					
		}
		System.out.println("--------------");
		for(;iter.hasNext();){
			Student stu=(Student) iter.next();
			System.out.println("学生信息="+stu);
			
		}
	}

}
