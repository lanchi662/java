package com.briup.chap07.thread;

public class SetDaemonTest implements Runnable{

	@Override
	public void run() {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
			System.out.println("��"+i+"��:"+result);
		}
		
	}
	public static void main(String[] args) {
		SetDaemonTest set=new SetDaemonTest();
		Thread thread=new Thread(set,"�߳�1");
		//����֮ǰ
		thread.setDaemon(true);
		thread.start();
		//����֮��
		//thread.setDaemon(true);
	}
}
