package com.igeek;

import java.text.SimpleDateFormat;

public class test02 {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
		while(true) {
			try {
			System.out.println(sdf.format(System.currentTimeMillis()));
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}

}
