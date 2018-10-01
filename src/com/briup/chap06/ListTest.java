package com.briup.chap06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class ListTest {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("www");
		list.add("www");
		list.add("www");
		list.add("www");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		Iterator i1=list.iterator();
		while(i1.hasNext()){
			Object o=i1.next();
			System.out.println("list集合遍历"+o);
			
		}
		Set set=new HashSet();
		set.add("www");
		set.add("www");
		set.add("www");
		set.add("www");
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		Iterator i2=set.iterator();
		while(i2.hasNext()){
			Object o=i2.next();
			System.out.println("set集合遍历"+o);
			
		}
	}

}
