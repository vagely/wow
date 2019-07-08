package com.igeek;

public class Demo9 {
	public static void main(String[] args) {
		String s1 = " hi hello";
		String s2="hi Hello";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("---------");
		System.out.println(s1.trim());
		System.out.println(s2.trim());
		System.out.println("--------");
		System.out.println("-----------");
		String s3="11,22,33,44";
		String[] st=s3.split(",");
		System.out.println(st);
		
		
	}

}
