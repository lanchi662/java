package com.briup.chap07.thread;

public class DeadLock {
	public static void main(String[] args) {
		Thread t1=new Thread1();
		Thread t2=new Thread2();
		t1.start();
		t2.start();
	}

}
class A{	
}
class B{	
}
class Thread1 extends Thread{
	@Override
	public void run() {
		synchronized (A.class) {
			System.out.println("A..............");
			synchronized (B.class) {
				System.out.println("A......B.......");
			}
		}
	}

}
class Thread2 extends Thread{
	@Override
	public void run() {
		synchronized (B.class) {
			System.out.println("B............");
			synchronized (A.class) {
				System.out.println("B........A.......");
			}
		}
	}
}