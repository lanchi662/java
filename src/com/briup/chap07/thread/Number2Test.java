package com.briup.chap07.thread;

public class Number2Test {
	public static void main(String[] args) {
		Thread t1=new Dome("线程1");
		Thread t2=new Dome("线程2");
		Thread t3=new Dome("线程3");
		t1.start();
		t2.start();
		t3.start();
	}
	
}
class Dome extends Thread{
	private String name;
	private static int numname;
	private static int num=1;
	private int count;

	public Dome(String name) {
		super(name);		
	}
	@Override
	public void run() {	
	//String str=Thread.currentThread().getName();	
	while(num<=75){
		synchronized(Object.class){
		while(!("线程"+(numname%3+1)).equals(getName())){			
			try {
				Object.class.notifyAll();
				Object.class.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(num<=75){
			System.out.println(getName()+":"+num++);
		}
		count++;
		if(count==5){			
			try {
				numname++;
				count=0;
				Object.class.notifyAll();
				Object.class.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		Object.class.notifyAll();
		}
		
	}
}
}
