package com.igeek;

import java.util.ArrayList;

public class Demo17 {
	public static void main(String[] args) {
		String[] strs = {"ÖÜ°ØºÀ","»Æ×ÚÔó","ÁÖ·å","ÓàÎÄÀÖ"};
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<strs.length;i++) {
			arr.add(strs[i]);
		}
		for (String name : arr) {
			System.out.println(name);
		}
	}
	

}
