package com.briup.chap07.thread;

public class JoinThread extends Thread{
	@Override
	public void run() {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
			System.out.println("��"+i+"��:"+result);
		}
		System.out.println(result);
		
	}
	public static void main(String[] args){
		System.out.println("��ʼִ��");
		Thread thread=new JoinThread();
		System.out.println("start֮ǰ"+thread.isAlive());
		thread.start();
		System.out.println("start֮��"+thread.isAlive());
		//����main�߳�
		try {
			//Thread.sleep(1000);
			//main�߳� ��thread�߳�
			thread.join();
			//thread.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block                         
			e.printStackTrace();
		}
		System.out.println("join֮��"+thread.isAlive());
		System.out.println("ִ�н���");
	}
}


