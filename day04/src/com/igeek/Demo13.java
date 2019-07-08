package com.igeek;

import java.util.Scanner;

/**
 * 判断一个字符串是否是对称字符串
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个字符串： ");
		String s=scanner.nextLine();
		boolean flag = isSymmetry(s);
		
/*		char[] t=s.toCharArray();
		for (int i = 0,j=t.length-1; i <=j; i++,j--) {
			
			if(t[i]==t[j]) {
				System.out.println("该字符串是对称字符串");
			}else {
				System.out.println("该字符串不是对称字符串");
			}
		}*/
	}
	/*
	 * 把字符反转，和原先的字符串内容比较
	 */
	public static boolean isSymmetry(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String res=sb.toString();
		return res.equals(s);
		
	}
     
}
