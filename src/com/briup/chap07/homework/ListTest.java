package com.briup.chap07.homework;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) throws Exception {
		test();

	}
	public static void test()throws Exception{
		ArrayList<String> list=new ArrayList<>();
		list.add("aaaa");
		list.add("eeee");
		list.add("dddd");
		 //String className="java.util.ArrayList";
		 //list=(ArrayList<String>) Class.forName(className).newInstance();
		//list.add("1");
		Class class2=list.getClass();
		Method method=class2.getMethod("add", Object.class);
		method.invoke(list, 1);		
		for(Object o:list){
			System.out.println(o);
		}
	}

}
