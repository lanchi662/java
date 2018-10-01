package com.briup.chap07.io.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class IoStudentTest {
	private static int n1;
	private static String n;
	
	public static void main(String[] args) throws IOException {		
		//InputStream inputstream=System.in;
		Student stu=new Student();
		Student stu1=new Student();
		InputStream in=System.in;
	    InputStreamReader is=new InputStreamReader(in);
	    BufferedReader buffer=new BufferedReader(is);
		System.out.println("请输入你的名字");
		String name=buffer.readLine();
		stu.setName(name);
		System.out.println("请输入你的年龄");
		String age1=buffer.readLine();
		int age=Integer.parseInt(age1);
		stu.setAge(age);
		System.out.println("是否继续添加:1继续,2退出");
		 n=buffer.readLine();
		 n1=Integer.parseInt(n);			
		while(n1==1){	
			System.out.println("请输入你的名字");		
			String name1=buffer.readLine();
			stu1.setName(name1);
			System.out.println("请输入你的年龄");
			String age2=buffer.readLine();
			int age3=Integer.parseInt(age2);
			stu1.setAge(age);
			System.out.println("是否继续添加:1继续,2退出");	
			n=buffer.readLine();
			 n1=Integer.parseInt(n);
			
		}
		if(n1==2){
			in.close();
			is.close();
			buffer.close();
		}
		System.out.println(stu);
		System.out.println(stu1);
		
		
	}

}
