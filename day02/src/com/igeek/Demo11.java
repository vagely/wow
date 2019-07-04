package com.igeek;

public class Demo11 {
	public static void main(String[] args) {
		System.out.println(sum(4.5f,7.9f));
		System.out.println(sum(3,4,5));
	}
	public static float sum(float a,float b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}

}
