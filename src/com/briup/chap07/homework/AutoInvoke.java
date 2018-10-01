package com.briup.chap07.homework;

import java.lang.reflect.Method;

public abstract class AutoInvoke {

    public  void  putValue(String name,Object value) throws Exception{
    	Student1 stu1=(Student1)value;
    	Class class1=stu1.getClass();
    	
    	Method method=class1.getMethod("set"+name,String.class);
    	
    	method.invoke(stu1,stu1.getClass());
    		/*Class class1=this.getClass();
    	  	
    		Method method=class1.getMethod("set"+name,value.getClass());
    		method.invoke(this,value);*/
    	
    }

    public Object outValue(String name) throws Exception{   	
    	Object o=null;
    	Class class1=this.getClass();
    	Method method=class1.getMethod("get"+name);
    	o=method.invoke(this);
        return o;
    }
}
