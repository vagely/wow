package com.igeek;

import java.util.Scanner;

//ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���(�����������ַ�)
public class Demo06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ����� ");
		String s=scanner.nextLine();
		int a=0,b=0,c=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>'a'&&ch<'z') {
				a++;
			}else if(ch>'A'&&ch<'Z') {
				b++;
			}else if(ch>'0'&&ch<'9'){
				c++;
			}
		}
		System.out.println("Сд��ĸ��: "+a+"��");
		System.out.println("��д��ĸ��: "+b+"��");
		System.out.println("�����ַ���: "+c+"��");
				
	}

}
