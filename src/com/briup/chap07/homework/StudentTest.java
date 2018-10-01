package com.briup.chap07.homework;

import java.lang.reflect.Method;

public class StudentTest {

	public static void main(String[] args)throws Exception {
		Student stu=new Student();
		test(stu,"id=5");
		test(stu,"name=tom");
		test(stu,"age=20");
		System.out.println(stu);
	}
	/*public static  void test(Object o,String msg)throws Exception{
		Student stu=(Student)o;
		Class class1=stu.getClass();
		Method method=class1.getMethod("set", long.class);
		method.invoke(o, Long.parseLong());
		//Object o1=method.invoke(o, msg);
		//System.out.println(o1);	
	}
}*/
	public static void test(Object o,String msg){
		 try {
			 Student stu=(Student)o;
       Class<? extends Student> c =  stu.getClass();
       String[] split = msg.split("=");
       String a = split[0];//  id
       //Id
       String cs=""+(char) ((a.substring(0, 1).toCharArray()[0])-32)+a.substring(1);
       String b = split[1];//  5
       if("id".equals(a)){
           Method method = c.getMethod("set"+cs, long.class);
          method.invoke(stu, Long.parseLong(b));
       }else if("age".equals(a)){
           Method method = c.getMethod("set"+cs,int.class);
           method.invoke(stu, Integer.parseInt(b));
       }else if("name".equals(a)){
           Method method = c.getMethod("set"+cs, String.class);
           method.invoke(stu, b);
       }else{

       }
   } catch (Exception e) {
       e.printStackTrace();
   }
}
}
