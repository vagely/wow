package com.igeek;

import java.util.Scanner;
/**
 * substring(int beginIndex, int endIndex)
 * 返回一个新字符串，它是此字符串的一个子字符串。
 * 该子字符串从指定的 beginIndex 处开始， endIndex:到指定的 endIndex-1处结束。
 * beginIndex - 开始处的索引（包括）。endindex 结尾处索引（不包括）。
 * 例："unhappy".substring(2) returns "happy"；"smiles".substring(0,5) returns "smile"
 */
public class Demo08 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String s=scanner.nextLine();
		//截取首字母
		String s1=s.substring(0, 1);
		String s2=s.substring(1);
		//拼接
		String s3=s1.toUpperCase()+s2.toLowerCase();
		System.out.println(s3);
		
		
	}

}
