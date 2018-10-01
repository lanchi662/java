package com.briup.chap07.weekend;

public class TestException {
	public static void main(String[] args) {
		try {
			
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
		} catch (Exception e) {
			if(args.length==0){
				System.out.println(" ‰»Î”–ŒÛ");
				
			}else{
				System.out.println(args[0]);
				System.out.println(args[1]);
				System.out.println(args[2]);
				
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
