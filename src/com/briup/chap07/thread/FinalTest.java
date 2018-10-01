package com.briup.chap07.thread;

public class FinalTest extends Thread{
	@Override
	public void run() {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
			System.out.println("第"+i+"次:线程1:"+result);
		}
		
	}
	public static void main(String[] args) {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
			System.out.println("第"+i+"次:main:"+result);
		}
		FinalTest ft=new FinalTest();
		Thread thread=Thread.currentThread();
		thread.setPriority(10);
		ft.setPriority(1);
		ft.start();
		ft.setName("线程1");
		System.out.println(thread.getName());
		System.out.println(ft.getName());
		
		//System.out.println(thread.getPriority());
		//System.out.println(ft.getPriority());
		
	}
}
