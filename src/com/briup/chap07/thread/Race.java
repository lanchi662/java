package com.briup.chap07.thread;

public class Race {
	public static void main(String[] args) {
		Thread Rabbit=new RabbitAndTurtle1("ÍÃ×Ó");
		Thread Turtle=new RabbitAndTurtle1("ÎÚ¹ê");
		Rabbit.start();
		Turtle.start();
	}

}
