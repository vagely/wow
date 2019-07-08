package com.igeek;
/**
 * 
 * @author vchili
 * char[] toCharArray()
 *
 */
public class Demo7 {
	public static void main(String[] args) {
		String s="abcde";
		char[] chs = s.toCharArray();
		for (char c : chs) {
			System.out.print(c+" ");
			
		}
		
		System.out.println("__________");
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
