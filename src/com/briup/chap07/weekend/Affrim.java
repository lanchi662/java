package com.briup.chap07.weekend;

public class Affrim {

	public static void main(String[] args) {
		
		assert args.length!=2:args;
		System.out.println(args[0]);
		System.out.println(args[1]);
		//System.out.println(args[2]);
	}

}
