package com.igeek;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		int count = 3;
		String username = "chili";
		String password = "chipkuku";
		//根据用户的输入比较用户名和密码
		for(int i=0;i<count;i++) {
			Scanner scanner = new Scanner(System.in);
		    System.out.println("输入用户名");
		    String name = scanner.nextLine();
		    System.out.println("请输入密码");
		    String pwd = scanner.nextLine();
		    //判断
		    if(username.equals(name)&&password.equals(pwd)) {
		    	System.out.println("成功登入");
		    	break;
		    }else {
		    	if(i==2) {
		    		System.out.println("账户被冻结");
		    	
		    	}else {
		    		System.out.println("登入失败，你还剩"+(2-i)+"机会");
		    	}
		    }
		}
	}
	
			

}
