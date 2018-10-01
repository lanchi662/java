package com.briup.chap07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;


public class EnhanceLoop {

	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("haha");
		set.add("lala");
		set.add("aede");
		set.add("lili");
		//增强for循环 可以适用 Collection不适用Map
		for(Object str:set){
			System.out.println(str);
		}
		System.out.println("-----------------");
		TreeMap tm=new TreeMap();
		tm.put(1, "haha");
		tm.put(3, "lala");
		tm.put(2, "aede");
		tm.put(4, "lili");
		for(Object key:tm.keySet()){
			System.out.println(key+" "+tm.get(key));
		}

	}

}
