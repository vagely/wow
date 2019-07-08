package com.igeek;

public class Demo01 {
	public static void main(String[] args) {
		String str ="hello";
		System.out.println(str);
		
		char data[]= {'a','b','c'};
		String str2 = new String(data);
		System.out.println(str2);
		String str3=new String(data,1,2);
		System.out.println(str3);
		String str4 = new String("world");
		System.out.println(str4);
	}

}
