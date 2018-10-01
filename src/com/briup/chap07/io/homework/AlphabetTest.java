package com.briup.chap07.io.homework;


import java.io.InputStream;

public class AlphabetTest {
	public static void main(String[] args) throws Exception {
		InputStream in=System.in;
		System.out.println("请输入一个小写字母");
		int n=in.read();
		char n1=(char)n;
		char n2=(char)(n1-32);
		System.out.println("输出字母为"+n2);
		in.close();
	}

}
