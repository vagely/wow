package com.igeek;

public class Demo17 {
	public static void main(String[] args) {
		int count=0;
		for(int i=10000;i<100000;i++ ) {
			int ge=i%10;
			int shi=i/10%10;
			int qian=i/1000%10;
			int wan=i/10000;
			if((ge==wan)&&(shi==qian)) {
				count++;
				System.out.println(i);
			}
		}
		
	}

}
