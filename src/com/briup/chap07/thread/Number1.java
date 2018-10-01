package com.briup.chap07.thread;
	public class Number1 extends Thread{
		private static boolean flog;
		
		private String name;
		private static int n=1;
		public Number1(){
			
		}
		public Number1(String name){
			super(name);
			
			
		}
		@Override
		public void run() {
			for(int j=0;j<5;j++){
			synchronized(Object.class){
				while(!(getName().equals("线程一")))
					try {
						Object.class.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}		
						
			for(int i=0;i<5;i++){				
					System.out.println(getName()+":"+n++);
					getName().equals("线程二");
					Object.class.notifyAll();
				}
			}
			}
			}
		
	}
	class Number2 extends Thread{
		private static int n=1;
		private String name;
		public Number2(String name){
			super(name);		
		}
		@Override
		public void run() {
		for(int j=0;j<5;j++){
			synchronized(Object.class){
			while(!(getName().equals("线程二")))
					try {
						Object.class.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}		
				for(int i=0;i<5;i++){
				
				System.out.println(getName()+":"+n++);
				getName().equals("线程三");
				Object.class.notifyAll();		
				}
				}
			}
		
	}
	}
	 class Number3 extends Thread{
		 private static int n=1;
		 private String name;
		 public Number3(String name){
				super(name);
			}
		 @Override
		public void run() {
			
		 for(int j=0;j<5;j++){
				synchronized(Object.class){
				while(!(getName().equals("线程三")))
						try {
							Object.class.wait();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}		
					for(int i=0;i<5;i++){
					
					System.out.println(getName()+":"+n++);
					getName().equals("线程一");
					Object.class.notifyAll();		
					}
					}
				}
			 
	 }
	 }

