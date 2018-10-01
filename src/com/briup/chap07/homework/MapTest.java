package com.briup.chap07.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "java");
		map.put(2, "unix");
		map.put(3, "alaa");
		map.put(4, "dede");
		Set<Entry<Integer,String>> set=map.entrySet();
		Iterator<Entry<Integer,String>> iter=set.iterator();
		while(iter.hasNext()){
			Entry<Integer, String> str=iter.next();
			System.out.println(str);
			
		}
		
	}

}
