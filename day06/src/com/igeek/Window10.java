package com.igeek;

import java.awt.HeadlessException;

import javax.swing.JFrame;
/*
 * 
 */
public class Window10 extends JFrame {
	MyPanel2 myPanel;

	public Window10() {
		super();
		myPanel = new MyPanel2();
		add(myPanel);
		
		
		
		 setTitle("��¼");
			setSize(300,150);
			setLocation(100, 50);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			//����Ļ������ʾ
			setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		Window10 win=new Window10();
	}
	
	
	

}
