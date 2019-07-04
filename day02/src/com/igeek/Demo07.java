package com.igeek;

public class Demo07 {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][];
		int[] arr3[];
	    System.out.println(arr);
	    System.out.println(arr.length);
	    System.out.println(arr[0].length);
	    System.out.println(arr[1]);
	    System.out.println(arr[0][2]);
	    //遍历二维数组
	    int[][] arr4= {{1,2,3},{4,5,6},{7,8,9}};
	    for(int i=0;i<arr4.length;i++) {
	    	for(int j=0;j<arr4.length;j++) {
	    		System.out.print(arr4[i][j]+" ");
	    	}
	    	System.out.println();
	    	System.out.println("**********");
	    	for (int[] a : arr4) {
	    		for (int t: a) {
	    			System.out.print(t+" ");
					
				}
	    			System.out.println();
	    		}
				
			}
	    }
	}
	


