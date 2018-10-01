package com.briup.chap07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
public class SetTest {

	public static void main(String[] args) {
		test();
	}
	public static void test(){
		List list=new ArrayList();
		list.add("ddd");
		list.add("aaa");
		list.add("sss");
		list.add("fan");
		//ÅÅĞò
		//×ª»¯
		TreeSet tr=new TreeSet(list);
		/*Iterator i=list.iterator();
		while(i.hasNext()){
			Object o=i.next();
			tr.add(o);
			
		}*/
		System.out.println(tr);
		
	}

}
