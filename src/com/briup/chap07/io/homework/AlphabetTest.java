package com.briup.chap07.io.homework;


import java.io.InputStream;

public class AlphabetTest {
	public static void main(String[] args) throws Exception {
		InputStream in=System.in;
		System.out.println("������һ��Сд��ĸ");
		int n=in.read();
		char n1=(char)n;
		char n2=(char)(n1-32);
		System.out.println("�����ĸΪ"+n2);
		in.close();
	}

}
