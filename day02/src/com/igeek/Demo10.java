package com.igeek;
/**
 * 
 * @author »ÆÐã·¼
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int max =getMax(10,58);
		System.out.println(max);
		System.out.println("*****");
		System.out.println(compare(10,90));
		System.out.println("*********");
		System.out.println(getMax(3,5,6));
		int[]arr= {12,4,6,8,10};
		System.out.println();
	}
	public static int getMax(int a,int b) {
	  int max=0;
	  if(a>b) {
		  max=a;
	  }else {
		  max=b;
	  }
	  return max;
	}
   public static boolean compare(int a,int b) {
	   return a==b;
   }
   public static int getMax(int a,int b,int c) {
	   int max=a;
	   if(max<b) {
		   max=b;
	  }else if(max<c){
		   max=c;
	   }
	   return max;
   }
}
