package com.igeek;
/**
 * �����������ݰ���ָ����ʽƴ�ӳ�һ���ַ���
 * ����:int[] arr={1,2,3}
 * ������:[1;2;3]
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		String s="[";
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {
				s+=arr[i];
			}else {
				s+=";"+arr[i];
			}
		}
		s+="]";
		System.out.println(s);
		
	}

}
