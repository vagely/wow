package com.igeek;

import java.util.Scanner;

/**
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ���ַ����� ");
		String s=scanner.nextLine();
		boolean flag = isSymmetry(s);
		
/*		char[] t=s.toCharArray();
		for (int i = 0,j=t.length-1; i <=j; i++,j--) {
			
			if(t[i]==t[j]) {
				System.out.println("���ַ����ǶԳ��ַ���");
			}else {
				System.out.println("���ַ������ǶԳ��ַ���");
			}
		}*/
	}
	/*
	 * ���ַ���ת����ԭ�ȵ��ַ������ݱȽ�
	 */
	public static boolean isSymmetry(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String res=sb.toString();
		return res.equals(s);
		
	}
     
}
