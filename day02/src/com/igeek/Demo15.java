package com.igeek;

public class Demo15 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		sum(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	public static void sum(int arr[]) {
		int t=0;
		for(int i=0;i<=arr.length-1;i++) {
			t=t+arr[i];
		}
		System.out.println(t);
	}
	

}
