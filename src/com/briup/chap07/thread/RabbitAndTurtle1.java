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
			if(num<=0.3&&getName().equals("����")){
				i+=2;
				System.out.println("��������"+i);
				if(i==100){
					System.out.println("����ʤ��������");
				}
			}
			if(num>0.3&&getName().equals("�ڹ�")){
				i++;
				System.out.println("�ڹ�����"+i);
				if(i==100){
					System.out.println("�ڹ�ʤ��������");
				}
			}
		}
		flog=true;
	
}

}
