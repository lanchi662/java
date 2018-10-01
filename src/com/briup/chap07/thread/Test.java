package com.briup.chap07.thread;

public class Test{
	public static void main(String[] args) {
		Test test=new Test();
		test.test();
	}
		//Object obj=new Object();
		public void test(){
			Test test=new Test();
		Thread n=new Number(test);
		Thread e=new English(test);
		n.start();
		e.start();
		
		
	}

}
class Number extends Thread{
	private Test test;
	public Number(Test test) {
		this.test=test;
	}
	@Override
	public void run() {
		synchronized(test){
		for(int i=1;i<=52;i++){
			System.out.println(i);
			test.notifyAll();;
			if(i%2==0){
				try {
					//µÈ´ıe
					test.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
				
			}
		}
	}
}

class English extends Thread{
	private Test test;
	public English(Test test) {
		this.test=test;
	}
	@Override
	public void run() {
		synchronized(test){
		for(char j='A';j<='Z';j++){
			System.out.println(j);
			test.notifyAll();
			if(j!='Z'){
				try {
					test.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			}
		}
	}
	
}
