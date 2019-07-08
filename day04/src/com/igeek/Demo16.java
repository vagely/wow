package com.igeek;

import java.util.ArrayList;

public class Demo16 {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("hi");
		//±éÀú
		for (int i = 0; i <arr.size(); i++) {
			System.out.println(arr.get(i));
			
		}
		//
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
