package com.briup.chap07.thread;

public class Race {
	public static void main(String[] args) {
		Thread Rabbit=new RabbitAndTurtle1("����");
		Thread Turtle=new RabbitAndTurtle1("�ڹ�");
		Rabbit.start();
		Turtle.start();
	}

}
