package com.igeek;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*流式布局
*/
public class Window03 extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5;
	public Window03() {
		jb1=new JButton("东");
		jb2=new JButton("西");
		jb3=new JButton("南");
		jb4=new JButton("北");
		jb5=new JButton("中");
		
		//添加
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		setTitle("FlowLayout布局");
		setSize(500,500);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Window03 win=new Window03();
	}
}
