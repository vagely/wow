package com.igeek;
/*
 * ¾ÙÀı:ÊäÈë"abc"
 * Êä³ö£º¡°cba¡±
 */
public class Demo11 {
	public static void main(String[] args) {
		String str ="abc";
		System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		char[] chs=str.toCharArray();
		for (int i = 0,j = chs.length-1;i<=j; i++,j--) {
			char t=chs[i];
			chs[i]=chs[j];
			chs[j]=t;
		}
		String str2=new String(chs);
		return str2;
		
	}

}
