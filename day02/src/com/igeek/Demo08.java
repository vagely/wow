package com.igeek;

public class Demo08 {
	public static void main(String[] args) {
		int lever=7;
		int[][] yangHui=new int [lever][];
		for(int i=0;i<yangHui.length;i++) {
			yangHui[i]=new int[i+1];
		}
		// System.out.println(yangHui);
		yangHui[0][0]=1;
		for (int i = 1; i < yangHui.length; i++) {
			//每个数组的第一个元素值1
			yangHui[i][0]=1;
			for (int j = 1; j < yangHui[i].length-1; j++) {
				yangHui[i][j] = yangHui[i-1][j]+yangHui[i-1][j-1];
				
			
			}
			yangHui[i][yangHui[i].length-1]=1;
		}
		for (int[] is : yangHui) {
			for (int is2 : is) {
				System.out.print(is2+" ");
				
			}
			System.out.println();
			
		}
	}

}
