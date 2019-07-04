package com.igeek;

import java.util.Scanner;

public class Demo19 {
	public static void main(String[] args) {
	/*	int[] arr= {89,93,94,80,88};
		int sum=0,avg;
		int max=arr[0];
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			sum+=arr[i];
		}
		sum=sum-max-min;
		
		avg=sum/(arr.length-2);
		System.out.println(avg);
		*/
		int[] arr=new int[6];
		Scanner scanner = new Scanner (System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Çë"+(i+1)+"ÆÀÎ¯´ò·Ö£º");
			int number = scanner.nextInt();
			arr[i]=number;
		}
		int max =getMax(arr);
		int min=getMin(arr);
		int sum=sum(arr);
		int avg=(sum-max-min)/(arr.length-2);
		System.out.println(avg);
			
		}
	public static int sum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}
		return sum;
	}
	public static int getMin(int[] arr) {
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return min;
	}
	public static int getMax(int[] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;
	}
}


