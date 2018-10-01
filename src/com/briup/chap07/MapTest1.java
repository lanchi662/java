package com.briup.chap07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		String str="aadfsdfdsfdsafafsafsawerewolfasd";
		char[]c=str.toCharArray();
		Map map=new HashMap();
		for(int i=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				int i2=(int)map.get(c[i])+1;
				map.put(c[i], i2);
			}else{
				map.put(c[i], 1);
			}
		}
			Set s=map.entrySet();
			Iterator i1=s.iterator();
			while(i1.hasNext()){
				Object key=i1.next();
				//Object value=map.get(key);
			System.out.println(key);
			}
		}

	}

