package com.igeek;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		int count = 3;
		String username = "chili";
		String password = "chipkuku";
		//�����û�������Ƚ��û���������
		for(int i=0;i<count;i++) {
			Scanner scanner = new Scanner(System.in);
		    System.out.println("�����û���");
		    String name = scanner.nextLine();
		    System.out.println("����������");
		    String pwd = scanner.nextLine();
		    //�ж�
		    if(username.equals(name)&&password.equals(pwd)) {
		    	System.out.println("�ɹ�����");
		    	break;
		    }else {
		    	if(i==2) {
		    		System.out.println("�˻�������");
		    	
		    	}else {
		    		System.out.println("����ʧ�ܣ��㻹ʣ"+(2-i)+"����");
		    	}
		    }
		}
	}
	
			

}
