package com.briup.chap07.thread;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
		/*	try {
				//睡眠
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}*/
			System.out.println("第"+i+"次:"+result);
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		//构建对象 Thread 子类
		RunnableThread  run1=new RunnableThread();
		//将RunnableThread转化成Thread子类
		Thread thread=new Thread(run1,"实现类线程");
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
		System.out.println("ssss");
	
	}
}
