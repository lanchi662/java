package com.briup.chap07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("kaka");
		list.add("lili");
		list.add("yiyi");
		list.add("dede");
		Iterator i=list.iterator();
		while(i.hasNext()){
			Object o=i.next();
			System.out.println("¼¯ºÏ±éÀú"+o);
		}
		
		

	}

}
