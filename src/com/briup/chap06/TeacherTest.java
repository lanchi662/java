package com.briup.chap06;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher t1=new Teacher("1223","хн╥и",20);
		Teacher t2=new Teacher("1223","хн╥и",20);
		System.out.println(t2.equals(t1));
		System.out.println(t1==t2);

	}

}
