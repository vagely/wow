package com.igeek;
/**
 * @author chili
 * @date 2019��7��2��
 * @version 1.0
 * @description:
 * ���󣺻�ȡ�������ֵ
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//��������
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
			//���ѭ��,���Ծ���һ���߶�����
			for(int i=0;i<arr.length-1;i++) {
				//�ڲ�ѭ��������Ƚ�
				for(int j=0;j<arr.length-1-i;j++) {
					//�����Ƚ�
					if(arr[j]>arr[j+1]) {
						//��λ
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
			System.out.println("����������Ϊ:");
			for (int i : arr) {
				System.out.print(i+"\t");
			}
		}
	}
	
	



