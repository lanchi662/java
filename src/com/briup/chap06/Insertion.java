package com.briup.chap06;

public class Insertion{
	public static void main(String []args){
		test();
		System.out.println("插入排序");
				}

	public static void test(){
		int arr[]=new int []{2,6,0,1,34,55};
		if(arr.length==0){
			System.out.println("该数组为空");
			}
		int temp;
		for(int i=1;i<arr.length;i++){
			temp=arr[i];
			int j=i-1;
			for(;j>=0&&arr[j]>temp;j--){
				arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
		for(int n:arr){
			System.out.println(n);
			}
		}

	
	}
