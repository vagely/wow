package com.igeek;

public class Demo13 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("1a: "+a+";"+"b: "+b);
		change(a,b);
		System.out.println("2a: "+a+";"+"b: "+b);
		
	}
	public static void change(int a,int b) {
		System.out.println("3a: "+a+";"+"b: "+b);
		a=b;
		b=a+b;
		System.out.println("4a: "+a+";"+"b: "+b);
	}

}
