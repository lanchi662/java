package com.briup.chap07;

public class Number {

	public static void main(String[] args) {
		int []arr2=arr1();
		test1(arr2);
	}
	public static void test1(int arr[]){
		for(int i=0;i<arr.length-1;i++){			
			int k=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[k]){
					k=j;
				}
				if(k!=i){
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				}
			}
		}
		for(int ss:arr){
			System.out.println(ss);
		}
	}
	public static int[] arr1(){
		int[] arrayOne=new int[10];
		for(int i=0;i<arrayOne.length;i++){
			double num3=Math.random();
		    double num1=num3*51+50;
		    int num2=(int)num1;	
		    //System.out.println(num2);
		    arrayOne[i]=num2;
		}
		return arrayOne;
	}
	

}
