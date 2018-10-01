package com.briup.chap07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class YanZheng {
	
	public static void main(String[] args) throws Exception {
		InputStream in=System.in;
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader buffer=new BufferedReader(isr);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String str=buffer.readLine();
		char c[]=str.toCharArray();
		int num =(int)(Math.random()*c.length);		
		System.out.println(c[num]);
			
		
	}

}
