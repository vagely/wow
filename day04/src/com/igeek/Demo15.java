package com.igeek;

import java.util.ArrayList;

public class Demo15 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		//���Ԫ��
		arrayList.add("hello");
		arrayList.add("world");
		
		arrayList.add(0,"hi");
		//java.lang.IndexOutOfBoundsException
		//arrayList.add(5,"java");
		System.out.println("---------");
		System.out.println(arrayList);
		System.out.println("------------");
		//����Ԫ������
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		
		//ɾ��
		String ele=arrayList.remove(0);
		System.out.println(ele);
		System.out.println(arrayList);
		
		/*System.out.println(arrayList.remove("world"));
		System.out.println(arrayList);*/
		
		//�޸�
		//arrayList.set(2, "andro");
		//System.out.println(arrayList.set(2, "hello"));
		
		
		
	}

}
