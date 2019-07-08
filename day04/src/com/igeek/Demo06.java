package com.igeek;

import java.util.Scanner;

//统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
public class Demo06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串： ");
		String s=scanner.nextLine();
		int a=0,b=0,c=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>'a'&&ch<'z') {
				a++;
			}else if(ch>'A'&&ch<'Z') {
				b++;
			}else if(ch>'0'&&ch<'9'){
				c++;
			}
		}
		System.out.println("小写字母有: "+a+"个");
		System.out.println("大写字母有: "+b+"个");
		System.out.println("数字字符有: "+c+"个");
				
	}

}
