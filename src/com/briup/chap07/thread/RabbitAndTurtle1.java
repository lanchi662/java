package com.briup.chap07.thread;

public class RabbitAndTurtle1 extends Thread{
	private static boolean flog=false;
	private String name;
	int i=0;
	
	public RabbitAndTurtle1(String name) {
		super(name);
		//this.name = name;
	}

	@Override
	public void run() {
		while(i<100){
			if(flog){
				break;
			}
			double num=Math.random();
			if(num<=0.3&&getName().equals("兔子")){
				i+=2;
				System.out.println("兔子跑了"+i);
				if(i==100){
					System.out.println("兔子胜利！！！");
				}
			}
			if(num>0.3&&getName().equals("乌龟")){
				i++;
				System.out.println("乌龟跑了"+i);
				if(i==100){
					System.out.println("乌龟胜利！！！");
				}
			}
		}
		flog=true;
	
}

}
