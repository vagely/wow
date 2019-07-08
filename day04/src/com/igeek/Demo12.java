package com.igeek;

public class Demo12 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
		
		//Á´Ê½±à³Ì
		sb.append("hello").append("word").append(100).append(true);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		//StringBuilder --String
		String str = sb.toString();
		System.out.println(str);
		StringBuilder sBuilder = new StringBuilder("hi");
		System.out.println(sBuilder);
	}

}
