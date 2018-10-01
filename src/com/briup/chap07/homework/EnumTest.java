package com.briup.chap07.homework;

public enum EnumTest {
	R("红色"),B("蓝色"),G("绿色");
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	private EnumTest(){}
	private EnumTest(String color) {
		this.color = color;
	}

	public static void main(String[]args){
		Cat an=new Cat();
		an.setName("lala");
		an.setEnumtest(B);
		System.out.println(an.getName());
		System.out.println(an.getEnumtest());
		System.out.println("-----------------");
		EnumTest et=EnumTest.G;
		System.out.println(et);
		String color1="R";
		R.setColor("红色");
		System.out.println(R.getColor());
		EnumTest et2=EnumTest.valueOf(color1);
		System.out.println(et2);
		System.out.println(".................");
		EnumTest[] et3=EnumTest.values();
		for(EnumTest et4:et3){
			System.out.println(et4);
		}
	} 
}
class Cat{
	private String name;
	private EnumTest enumtest;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, EnumTest enumtest) {
		super();
		this.name = name;
		this.enumtest = enumtest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EnumTest getEnumtest() {
		return enumtest;
	}
	public void setEnumtest(EnumTest enumtest) {
		this.enumtest = enumtest;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", enumtest=" + enumtest + "]";
	}
	
}
