package com.igeek;
/*
 * 1.extends JFrame
 * 2.定义组件
 * 3.创建组件的过程
 * 4.添加组件
 * 5.设置布局
 * 6.JFrame设置
 */
import javax.swing.JButton;
import javax.swing.JFrame;


public class Window01 extends JFrame {
	JButton jButton;
	
	public Window01() {
		//按钮
		jButton=new JButton("按钮");
		//添加
		this.add(jButton);
		setTitle("按钮组件");
		setSize(500,500);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Window01 win=new Window01();
	}
	

}
