package com.briup.chap07.io.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class IoStudentTest1 {
	private static String n;
	private static int n1;
	private static boolean flog=true;
	public static void main(String[] args) throws IOException {		
		test();		
	}
	public static void test() throws IOException{
		ArrayList<Student> list=new ArrayList<Student>();
		Student stu=new Student();
		Student stu1=new Student();
		list.add(stu);
		list.add(stu1);		
		InputStream in=System.in;
	    InputStreamReader is=new InputStreamReader(in);
	    BufferedReader buffer=new BufferedReader(is);
		System.out.println("�������������");		
		stu.setName(buffer.readLine());
		System.out.println("�������������");
		String age1=buffer.readLine();
		int age=Integer.parseInt(age1);
		stu.setAge(age);
		System.out.println("�Ƿ�������:1 ����,2 �˳�,3 ��ѯ,4 ɾ��");
		 n=buffer.readLine();
		 n1=Integer.parseInt(n); 
		 /*switch(n1){
		 case 1:{
			    System.out.println("�������������");		
				stu1.setName(buffer.readLine());
				System.out.println("�������������");
				String age2=buffer.readLine();
				int age3=Integer.parseInt(age2);
				stu1.setAge(age);
				System.out.println("�Ƿ�������:1����,2�˳�,3��ѯ,4ɾ��");	
				 n=buffer.readLine();
				 n1=Integer.parseInt(n);				 
		 }
		 case 2:{
			 	in.close();
				is.close();
				buffer.close();
				
		 }
		 case 3:{
			 for(Object o:list){
					System.out.println(o);
				}
			 System.out.println("�Ƿ�������:1����,2�˳�, 3��ѯ,4ɾ��");
			 n=buffer.readLine();
			 n1=Integer.parseInt(n);
			 
		 }
		 case 4:{
			 list.remove(1);
				for(Object o:list){
					System.out.println(o);
				}
				System.out.println("�Ƿ�������:1����,2�˳�,3��ѯ,4ɾ��");
				n=buffer.readLine();
				n1=Integer.parseInt(n);
				
		 }
		 default:
			 //break;
				 
		 }*/
		 while(flog){
		while(n1==1){	
			System.out.println("�������������");		
			stu1.setName(buffer.readLine());
			System.out.println("�������������");
			String age2=buffer.readLine();
			int age3=Integer.parseInt(age2);
			stu1.setAge(age);
			System.out.println("�Ƿ�������:1����,2�˳�,3��ѯ,4ɾ��");	
			 n=buffer.readLine();
			 n1=Integer.parseInt(n);
			
		 }
		 
		 if(n1==2){
			    in.close();
				is.close();
				buffer.close();	
					
				}
		while(n1==3){			
			 for(Object o:list){
					System.out.println(o);
				}
			 System.out.println("�Ƿ�������:1����,2�˳�, 3��ѯ,4ɾ��");
			 n=buffer.readLine();
			 n1=Integer.parseInt(n);
			 
		 }
		while(n1==4){			
			list.remove(1);
			for(Object o:list){
				System.out.println(o);
			}
			System.out.println("�Ƿ�������:1����,2�˳�,3��ѯ,4ɾ��");
			n=buffer.readLine();
			n1=Integer.parseInt(n);
			
		}
		 }
		
		
	}
	
		
		}
	



