package com.briup.chap07.thread;

public class Number1Test {
	public static void main(String[] args) {
		Thread t1=new Number1("�߳�һ");
		Thread t2=new Number1("�̶߳�");
		Thread t3=new Number1("�߳���");
		t1.start();
		t2.start();
		t3.start();
	}

}
