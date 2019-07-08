package com.igeek;
/**
 * 把数组中数据按照指定格式拼接成一个字符串
 * 举例:int[] arr={1,2,3}
 * 输出结果:[1;2;3]
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		String s="[";
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {
				s+=arr[i];
			}else {
				s+=";"+arr[i];
			}
		}
		s+="]";
		System.out.println(s);
		
	}

}
