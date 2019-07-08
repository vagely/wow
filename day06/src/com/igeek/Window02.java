package com.igeek;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*布局管理器
 * 组件在容器中JFrame的位置大小
 */
public class Window02 extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5;
	public Window02() {
		jb1=new JButton("东");
		jb2=new JButton("西");
		jb3=new JButton("南");
		jb4=new JButton("北");
		jb5=new JButton("中");
		
		
		add(jb1,BorderLayout.EAST);
		add(jb2,BorderLayout.WEST);
		add(jb3,BorderLayout.SOUTH);
		add(jb4,BorderLayout.NORTH);
		add(jb5,BorderLayout.CENTER);
		
		
		setTitle("BorderLayout布局");
		setSize(500,500);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Window02 win=new Window02();
	}

}
