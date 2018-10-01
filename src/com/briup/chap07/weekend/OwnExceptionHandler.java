package com.briup.chap07.weekend;

public class OwnExceptionHandler{
	public static void main(String[]args){
		OwnExceptionSource oe=new OwnExceptionSource();
		try {
			oe.a();
		} catch (OwnException e) {
			
			e.printStackTrace();
		}
	}
	
}
class OwnException extends Exception {

}
class OwnExceptionSource{
	public void a()throws OwnException{
		System.out.println("-------");
	}
	
}
