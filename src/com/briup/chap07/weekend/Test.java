package com.briup.chap07.weekend;

public class Test {
	public static void main(String[] args)throws Exception  {
		 Employee e2=new  Employee("111",66,"");
		 Employee e3=new Employee(1000,"620521111111223345");
		 e2.addSalary(1000);
		 e2.minusSalary(900);
		 e2.showTotalEmployee(0);
	}
}
