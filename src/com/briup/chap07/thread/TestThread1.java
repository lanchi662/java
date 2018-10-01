package com.briup.chap07.thread;
/**启动线程
 * 线程类对象.start();
 * Thread  和它的子类
 * 不要调用run();
 */
public class TestThread1 extends Thread{
	@Override
	public void run() {
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println(name+" run---------");
	}
	public static void main(String[] args) {
		//创建线程类对象
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println("主线程"+name);
		Thread test=new TestThread1();
		test.setName("线程1");
		test.start();
		System.out.println("执行完这些代码"+name);
}
}
