package com.briup.chap07.thread;

public class SetDaemonTest implements Runnable{

	@Override
	public void run() {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
			System.out.println("第"+i+"次:"+result);
		}
		
	}
	public static void main(String[] args) {
		SetDaemonTest set=new SetDaemonTest();
		Thread thread=new Thread(set,"线程1");
		//启动之前
		thread.setDaemon(true);
		thread.start();
		//启动之后
		//thread.setDaemon(true);
	}
}
