package com.briup.chap07.thread;

public class TestThread {
	public static void main(String[] args) {
		//��ȡ��ǰ�̵߳Ķ���
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println("��ȡ��ǰ�̵߳�����"+name);
		//�޸��̵߳�����
		thread.setName("lala thread");
		String name1=thread.getName();
		System.out.println("�޸ĺ��̵߳�����"+name1);
		//�����߳�����  ���óɺ�̨�߳�
		//thread.setDaemon(false);
		//�����̵߳����ȼ��� 1---10
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		thread.setPriority(3);
		//��ȡ��ǰ�̵߳����ȼ�
		System.out.println(thread.getPriority());
		
	}

}
