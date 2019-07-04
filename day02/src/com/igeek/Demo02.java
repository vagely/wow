package com.igeek;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author chili
 * @date 2019年7月2日
 * @version 1.0
 * @description:
 * 系统产生一个1-100之间的随机数，请猜出这个随机数是多少。
 * 分析:
 *     A:系统产生一个随机数1-100之间的。
 *       int number = r.netInt(100)+1;
 *     B:键盘录入我们要猜的数据
 *        用Scanner实现
 *     C:比较这两个数据(用if语句)
 *          大了:给出提示大了
 *          小了:给出提示小了
 *          猜中了:给出提示，恭喜你,猜中了
 *     D:多次猜数据，而我们不知道要猜多少次，怎么办呢?
 *
 */

public class Demo02 {
	public static void main(String[] args) {
		
		Random random= new Random();
		int number=random.nextInt(100)+1;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入随机数1-100: ");
			int guessNumber = scanner.nextInt();
			if(guessNumber>number) {
				System.out.println("大了");
			}else if(guessNumber>number){
				System.out.println("小了");
				
			}else{
				System.out.println("恭喜你，猜中了");
				break;
				
			}
			
		}
	}
	

}
