package com.briup.chap07.weekend;

public class DivisionByZero {
	public static void main(String[] args) {
		DivisionByZero db=new DivisionByZero();
		try {
			db.division();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public void division(){
		int i=10;
		int j=0;
		try {
			int result=i/j;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	public void division(){
		int i=10;
		int j=0;
		int result=i/j;
	}

}
