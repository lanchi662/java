package com.briup.chap07.thread;

public class NumThread extends Thread{
	
	private static boolean stopFlog;
	public void run() {
		for (int i = 0; i <=10; i++) {
			if(stopFlog){
				break;
			}							
			try {
				int num=(int)(Math.random()*2000);
				Thread.sleep(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Êý×ÖÎª:"+i);
			
			
		}
		stopFlog=true;
}
	public static void main(String[] args)  {
	  Thread thread=new NumThread();
	  Thread thread1=new NumThread();
	  thread.start();
	  thread1.start();
	/*  try {
		thread.join();
		thread.interrupt();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	 // 
	
	  
	  

	}
}
