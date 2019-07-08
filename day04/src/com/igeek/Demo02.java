package com.igeek;

public class Demo02 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(s1==s2);
		String s3="hello";
		System.out.println(s1==s3);
		System.out.println(s2==s3);
	}

}
