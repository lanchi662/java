package com.briup.chap07.thread;
/**�����߳�
 * �߳������.start();
 * Thread  ����������
 * ��Ҫ����run();
 */
public class TestThread1 extends Thread{
	@Override
	public void run() {
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println(name+" run---------");
	}
	public static void main(String[] args) {
		//�����߳������
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println("���߳�"+name);
		Thread test=new TestThread1();
		test.setName("�߳�1");
		test.start();
		System.out.println("ִ������Щ����"+name);
}
}
