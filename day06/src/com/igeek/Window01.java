package com.igeek;
/*
 * 1.extends JFrame
 * 2.�������
 * 3.��������Ĺ���
 * 4.������
 * 5.���ò���
 * 6.JFrame����
 */
import javax.swing.JButton;
import javax.swing.JFrame;


public class Window01 extends JFrame {
	JButton jButton;
	
	public Window01() {
		//��ť
		jButton=new JButton("��ť");
		//���
		this.add(jButton);
		setTitle("��ť���");
		setSize(500,500);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Window01 win=new Window01();
	}
	

}
