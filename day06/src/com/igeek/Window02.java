package com.igeek;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*���ֹ�����
 * �����������JFrame��λ�ô�С
 */
public class Window02 extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5;
	public Window02() {
		jb1=new JButton("��");
		jb2=new JButton("��");
		jb3=new JButton("��");
		jb4=new JButton("��");
		jb5=new JButton("��");
		
		
		add(jb1,BorderLayout.EAST);
		add(jb2,BorderLayout.WEST);
		add(jb3,BorderLayout.SOUTH);
		add(jb4,BorderLayout.NORTH);
		add(jb5,BorderLayout.CENTER);
		
		
		setTitle("BorderLayout����");
		setSize(500,500);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Window02 win=new Window02();
	}

}
