package com.briup.chap07.net.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest1 {
	public static void main(String[] args) throws Exception {
				
		InputStream in=System.in;
		InputStreamReader ins=new InputStreamReader(in);
		BufferedReader buffer=new BufferedReader(ins);
		System.out.println("请输入学生的信息：");
		String str=null;
		str=buffer.readLine();
		String str1[]=str.split(":");
		String name=str1[0];
		String age=str1[1];
		int age1=Integer.parseInt(age);
		String gender=str1[2];
		Student stu=new Student(name,age1,gender);
		String name1=str1[3];
		String age2=str1[4];
		int age3=Integer.parseInt(age2);
		String gender1=str1[5];
		Student stu1=new Student(name1,age3,gender1);
		Socket socket=new Socket("127.0.0.1",9999);
		OutputStream out=socket.getOutputStream();
		ObjectOutputStream outs=new ObjectOutputStream(out);
		//PrintStream print=new PrintStream(out);
		if(buffer.readLine().equals("end")){
		   outs.writeObject(stu);
		   outs.writeObject(stu1);
		   outs.flush();
		
		}
		socket.close();
		in.close();
		ins.close();		
		out.close();
		outs.close();	
		buffer.close();
	}
		
		
	
}
