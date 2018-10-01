package com.briup.chap07.thread;

public class JoinThread extends Thread{
	@Override
	public void run() {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
			System.out.println("第"+i+"次:"+result);
		}
		System.out.println(result);
		
	}
	public static void main(String[] args){
		System.out.println("开始执行");
		Thread thread=new JoinThread();
		System.out.println("start之前"+thread.isAlive());
		thread.start();
		System.out.println("start之后"+thread.isAlive());
		//阻塞main线程
		try {
			//Thread.sleep(1000);
			//main线程 等thread线程
			thread.join();
			//thread.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block                         
			e.printStackTrace();
		}
		System.out.println("join之后"+thread.isAlive());
		System.out.println("执行结束");
	}
}


