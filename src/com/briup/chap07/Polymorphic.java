package com.briup.chap07;
public class Polymorphic {
	public static void main(String[] args) {
		C b = new C();
	}
}
class F {
	F() {
		System.out.print("j");//1
	}
	public void funcOfF() {
		System.out.print("1");//3
	}
}
class B {
	static F f = new F();
	public String sb = getSb();
	static {
		System.out.print("d");//2
		f.funcOfF();
	}
	{
		System.out.print("6");//6
	}
	B() {
		System.out.print("x");//7
	}
	public String getSb() {
		System.out.print("0");//5
		return "sb";
	}
}
class C extends B {
	static {
		System.out.print("8");//4
	}
	{
		System.out.print("y");//8
	}
	C() {
		System.out.print("z");//9
	}
}