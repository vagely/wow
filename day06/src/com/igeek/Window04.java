package com.igeek;
//网格布局:GridLayout

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window04 extends JFrame {
	JButton[] jbs=new JButton[9];
	public Window04() {
		//创建组件
		for (int i = 0; i < jbs.length; i++) {
			jbs[i]=new JButton(String.valueOf(i+1));
		}
		//添加组件
		for (int i = 0; i < jbs.length; i++) {
			add(jbs[i]);
		}
		//设置
		setLayout(new GridLayout(3,3));
		setTitle("GridLayout布局");
		setSize(500,500);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		Window04 win=new Window04();
	}
	

	
}
