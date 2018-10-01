package com.briup.chap07.io.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PropertiesFile {
	private static String name1;
	public static void test(String name) throws Exception{
		FileReader fr=new FileReader(name);
		BufferedReader br=new BufferedReader(fr);
		InputStream in=System.in;
	    InputStreamReader is=new InputStreamReader(in);
	    BufferedReader buffer=new BufferedReader(is);
		String str=null;		
		System.out.println("«Î ‰»Î Ù–‘√˚");
		name1=buffer.readLine();
		while((str=br.readLine())!=null){			
			String str1[]=str.split("=");
			if(name1.equals(str1[0])){
				System.out.println(str1[0]+"="+str1[1]);
			}
			
				
			}
				fr.close();
		        br.close();
		        buffer.close();
			
		}
			
	
	public static void main(String[] args) throws Exception {
		test("file/message");
	}

}
