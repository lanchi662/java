package com.briup.chap07;

public class Test {

	public static void main(String[] args) {
	test(4);	

	}
	public static void test(int num){
		for(int i=31;i>=0;i--){
			int num1=(num>>i)&1;
			System.out.print(num1);
		}
	}
}
