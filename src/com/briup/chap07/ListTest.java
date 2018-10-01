package com.briup.chap07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) {
	String str="wwqweqdasdafdsfdsferer";
	char []c=str.toCharArray();
	Set set=new HashSet();
	for(int i=0;i<c.length;i++){
		set.add(c[i]);
	}
	Iterator i=set.iterator();
	while(i.hasNext()){
		Object o=i.next();
		System.out.println("set¼¯ºÏ"+o);
		
	}
	

	}

}
