package com.briup.chap07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapTest {

	public static void main(String[] args) {
		testHashmap();
		//testTreemap();
	}
	public static void testHashmap(){
		//Map
		//添加元素
		Map map=new HashMap();
		map.put(1, "haha");
		map.put(2, "lala");
		map.put(3, "dede");
		map.put(4, "lili");
		boolean b=map.isEmpty();
		System.out.println(b);
		//查看key
		boolean b1=map.containsKey(1);
		System.out.println(b1);
		//获取key是3的value值
		Object o=map.get(3);
		System.out.println(o);
		System.out.println("----------------");
		//keySet value entrySet
		//1.遍历Map集合 返回所有的key值 用keySet
		Set s=map.keySet();
		Iterator i=s.iterator();
		for(;i.hasNext();){
			Object key=i.next();
			Object value=map.get(key);
			System.out.println(key);
			System.out.println(value);
		}
		System.out.println("------------------");
		//2. 用value
			Collection value1=map.values();
			Iterator i1=value1.iterator();
			for(;i1.hasNext();){
				Object value=i1.next();
				System.out.println(value);
			}
			System.out.println("--------------------");
		//3.用entrySet
			Set s1=map.entrySet();
			Iterator i2=s1.iterator();
			for(;i2.hasNext();){
				//Map.Entry obj=(Map.Entry)i2.next();
				Object key=i2.next();
				//Object key=obj.getKey();
				//Object value=obj.getValue();
				System.out.println(key);
				
			}
	}
	public static void testTreemap(){
		//排序
		TreeMap tm=new TreeMap();
		tm.put(1, "haha");
		tm.put(3, "lala");
		tm.put(2, "aede");
		tm.put(4, "lili");
		Set s=tm.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
			Object key=i.next();
			Object value=tm.get(key);
			System.out.println(key);
		}
	}

}
