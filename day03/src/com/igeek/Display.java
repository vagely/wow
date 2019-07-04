package com.igeek;

public class Display {
	private static final char[] getValue = null;
	private int value;
	private int limit;
	public Display(int limit) {
		super();
		this.limit = limit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void increase() {
		value++;
	    if(value==limit) {
	    	value=0;
	    }
	}
	  public static void main(String[] args) {
		Display hour =new Display(24);
		for(;;){
			hour.increase();
			System.out.println(hour.getValue);
			
		}
	}

}
