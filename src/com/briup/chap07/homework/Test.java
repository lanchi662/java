package com.briup.chap07.homework;
public class Test {
	public static void main(String[] args)throws Exception {
		Student1 o =  new Student1 ();
        o.putValue("Name", "tom");
        o.putValue("Email", "abc@163.com");
        o.putValue("Phone", "19999999");
        o.putValue("Address", "µÿ÷∑");
        o.putValue("Age", 24);
        //o.putValue("Birthday", new Date());
        System.out.println(o);
        System.out.println("----------------");
		System.out.println(o.outValue("Name"));
    	System.out.println(o.outValue("Email"));
    	System.out.println(o.outValue("Phone"));
    	System.out.println(o.outValue("Address"));
    	System.out.println(o.outValue("Age"));
    	System.out.println(o.outValue("Birthday"));

	}

}
