package com.igeek;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author chili
 * @date 2019��7��2��
 * @version 1.0
 * @description:
 * ϵͳ����һ��1-100֮������������³����������Ƕ��١�
 * ����:
 *     A:ϵͳ����һ�������1-100֮��ġ�
 *       int number = r.netInt(100)+1;
 *     B:����¼������Ҫ�µ�����
 *        ��Scannerʵ��
 *     C:�Ƚ�����������(��if���)
 *          ����:������ʾ����
 *          С��:������ʾС��
 *          ������:������ʾ����ϲ��,������
 *     D:��β����ݣ������ǲ�֪��Ҫ�¶��ٴΣ���ô����?
 *
 */

public class Demo02 {
	public static void main(String[] args) {
		
		Random random= new Random();
		int number=random.nextInt(100)+1;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("�����������1-100: ");
			int guessNumber = scanner.nextInt();
			if(guessNumber>number) {
				System.out.println("����");
			}else if(guessNumber>number){
				System.out.println("С��");
				
			}else{
				System.out.println("��ϲ�㣬������");
				break;
				
			}
			
		}
	}
	

}
