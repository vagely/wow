package com.igeek;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("¼��һ���·�(1-12):");
		int month = scanner.nextInt();
		switch(month) {
		case 1:
		case 2:	
		case 12:
			System.out.println("����");
			break;
		case 9:
		case 10:	
		case 11:
			System.out.println("�＾");
			break;
		case 6:
		case 7:	
		case 8:
			System.out.println("�ļ�");
			break;
		case 3:
		case 4:	
		case 5:
			System.out.println("����");
			break;
			default:
				System.out.println("�������");
				break;
		}
	}

}
