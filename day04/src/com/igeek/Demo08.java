package com.igeek;

import java.util.Scanner;
/**
 * substring(int beginIndex, int endIndex)
 * ����һ�����ַ��������Ǵ��ַ�����һ�����ַ�����
 * �����ַ�����ָ���� beginIndex ����ʼ�� endIndex:��ָ���� endIndex-1��������
 * beginIndex - ��ʼ������������������endindex ��β������������������
 * ����"unhappy".substring(2) returns "happy"��"smiles".substring(0,5) returns "smile"
 */
public class Demo08 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s=scanner.nextLine();
		//��ȡ����ĸ
		String s1=s.substring(0, 1);
		String s2=s.substring(1);
		//ƴ��
		String s3=s1.toUpperCase()+s2.toLowerCase();
		System.out.println(s3);
		
		
	}

}
