package com.briup.chap07.net.homework;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test {
	public static void main(String[] args) throws Exception {
		Student stu=new Student();
		FileInputStream file=new FileInputStream("file/student.txt");
		ObjectInputStream oin=new ObjectInputStream(file);		
		Object o=oin.readObject();
		Object o1=oin.readObject();
		System.out.println(o);
		System.out.println(o1);
		oin.close();
		file.close();
	}

}
