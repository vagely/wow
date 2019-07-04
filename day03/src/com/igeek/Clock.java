package com.igeek;

public class Clock {
	Display hour =new Display(24);
	Display minute =new Display(60);
	public void start() {
		while(true) {
			try {
				Thread.sleep(1000);
				minute.increase();
				if(minute.getValue()==0) {
					hour.increase();
				}
				System.out.println(hour.getValue()+":"+minute.getValue());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		Clock clock=new Clock();
		clock.start();
		
	}

}
