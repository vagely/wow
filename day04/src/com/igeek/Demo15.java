package com.igeek;

import java.util.ArrayList;

public class Demo15 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		//添加元素
		arrayList.add("hello");
		arrayList.add("world");
		
		arrayList.add(0,"hi");
		//java.lang.IndexOutOfBoundsException
		//arrayList.add(5,"java");
		System.out.println("---------");
		System.out.println(arrayList);
		System.out.println("------------");
		//返回元组数量
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		
		//删除
		String ele=arrayList.remove(0);
		System.out.println(ele);
		System.out.println(arrayList);
		
		/*System.out.println(arrayList.remove("world"));
		System.out.println(arrayList);*/
		
		//修改
		//arrayList.set(2, "andro");
		//System.out.println(arrayList.set(2, "hello"));
		
		
		
	}

}
