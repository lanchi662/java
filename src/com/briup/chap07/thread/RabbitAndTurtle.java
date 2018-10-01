package com.briup.chap07.thread;

public class RabbitAndTurtle extends Thread{
	private static boolean stopFlog;
	@Override
	public void run() {
	double num=Math.random();
		if(num>0&&num<0.3){
			Thread r=new Rabbit();
			/*for(int i=0;i<=100;i+=2){
				if(stopFlog){
					break;
				}
				System.out.println("ÍÃ×Ó¿ªÊ¼ÅÜ"+i);
			}
			stopFlog=true;
			System.out.println("ÍÃ×ÓÊ¤Àû£¡£¡£¡");*/		
		}  
		if(num>0.3&&num<1){
			Thread t=new Turtle();
			/*for(int i=0;i<=100;i++){
				if(stopFlog){
					break;
				}
				System.out.println("ÎÚ¹ê¿ªÊ¼ÅÜ"+i);
			}
			stopFlog=true;
			System.out.println("ÎÚ¹êÊ¤Àû£¡£¡£¡");

		}	*/	
		}
	}	
	public static void main(String[] args) {
		Thread rt=new RabbitAndTurtle();
		Thread r=new Rabbit();
		Thread t=new Turtle();
		r.start();
		t.start();
		
	}

}
class Rabbit extends Thread{
	private static boolean stopFlog;
	@Override
	public  void run() {
		for(int i=0;i<=100;i+=2){
			/*if(stopFlog){
				break;
			}*/
			System.out.println("ÍÃ×Ó¿ªÊ¼ÅÜ"+i);
		if(i==100){
			System.out.println("ÍÃ×ÓÊ¤Àû£¡£¡£¡");
	
		}
		}
		//stopFlog=true;
		
	}  
}
class Turtle extends Thread{
	private static boolean stopFlog;
	public  void run(){
		for(int i=0;i<=100;i++){
			/*if(stopFlog){
				break;
			}*/
			System.out.println("ÎÚ¹ê¿ªÊ¼ÅÜ"+i);
			if(i==100){
				System.out.println("ÎÚ¹êÊ¤Àû£¡£¡£¡");
			}
		}
		//stopFlog=true;
		

	}
}