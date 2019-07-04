package com.igeek;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Â¼ÈëÒ»¸öÔÂ·İ(1-12):");
		int month = scanner.nextInt();
		switch(month) {
		case 1:
		case 2:	
		case 12:
			System.out.println("¶¬¼¾");
			break;
		case 9:
		case 10:	
		case 11:
			System.out.println("Çï¼¾");
			break;
		case 6:
		case 7:	
		case 8:
			System.out.println("ÏÄ¼¾");
			break;
		case 3:
		case 4:	
		case 5:
			System.out.println("´º¼¾");
			break;
			default:
				System.out.println("ÊäÈë´íÎó");
				break;
		}
	}

}
