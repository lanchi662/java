package com.briup.chap06;

import java.util.Scanner;
public class fff{
	public static void main(String[] args){
		for(int i=100;i<1000;i++){
			if(isLotus(i))
			   System.out.print(i+" ");
		}
		System.out.println();
	}
	//ÅÐ¶ÏË®ÏÉ»¨Êý
	private static boolean isLotus(int lotus){
		int m = 0;
		int n = lotus;
		int sum = 0;
		m = n/100;
		n  -= m*100;
		sum = m*m*m;
		m = n/10;
		n -= m*10;
		sum += m*m*m + n*n*n;
		if(sum==lotus)
			return true;
		else
			return false;
		}
}