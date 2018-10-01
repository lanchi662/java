package com.briup.chap07.thread;

public class TestThread {
	public static void main(String[] args) {
		//获取当前线程的对象
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println("获取当前线程的名字"+name);
		//修改线程的名字
		thread.setName("lala thread");
		String name1=thread.getName();
		System.out.println("修改后线程的名字"+name1);
		//设置线程类型  设置成后台线程
		//thread.setDaemon(false);
		//设置线程的优先级别 1---10
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		thread.setPriority(3);
		//获取当前线程的优先级
		System.out.println(thread.getPriority());
		
	}

}
