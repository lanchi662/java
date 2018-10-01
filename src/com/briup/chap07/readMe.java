package com.briup.chap07;
public class readMe{
		public static void main(String[] args){
					System.out.println("1");//1
							new D();
								}
}
class C1{
		static{System.out.println("2");}//2
			C1(){System.out.println("3");}//6
				{System.out.println("4");}//5
}
class D extends C1{
		public String sd1=getSd1();
			static public String getSd(){
			System.out.println("5");//4
				return "sd";
								}
			static{System.out.println("6");}//3
			public static String sd=getSd();
			D(){System.out.println("7");}//9
			{System.out.println("8");}//8
			public String getSd1(){
			System.out.println("9");//7
			return "sd1";
	}
}

