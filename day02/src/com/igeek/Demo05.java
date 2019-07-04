package com.igeek;
/**
 * @author chili
 * @date 2019年7月2日
 * @version 1.0
 * @description:
 * 需求：获取数组的最值
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//定义数组
		int[] arr= {12,98,45,73,60};
		int max=arr[0];
		int min=arr[0];
		for (int i=1 ; i<arr.length;i++) {
			if(arr[i]>max) {
				 max=arr[i];
				
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
			
		}
		System.out.println(max+";"+min);
		bubbleSort(arr);
	}
		public static void bubbleSort(int[] arr) {
			int temp;
			//外层循环,可以决定一共走多少趟
			for(int i=0;i<arr.length-1;i++) {
				//内层循环，逐个比较
				for(int j=0;j<arr.length-1-i;j++) {
					//两两比较
					if(arr[j]>arr[j+1]) {
						//换位
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
			System.out.println("排序后的数组为:");
			for (int i : arr) {
				System.out.print(i+"\t");
			}
		}
	}
	
	



