package com.briup.chap07.thread;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		int result=0;
		for (int i = 0; i <=10; i++) {
			result+=i;
		/*	try {
				//˯��
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}*/
			System.out.println("��"+i+"��:"+result);
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		//�������� Thread ����
		RunnableThread  run1=new RunnableThread();
		//��RunnableThreadת����Thread����
		Thread thread=new Thread(run1,"ʵ�����߳�");
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
		System.out.println("ssss");
	
	}
}
