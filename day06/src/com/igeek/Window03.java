package com.igeek;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*��ʽ����
*/
public class Window03 extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5;
	public Window03() {
		jb1=new JButton("��");
		jb2=new JButton("��");
		jb3=new JButton("��");
		jb4=new JButton("��");
		jb5=new JButton("��");
		
		//���
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		//���ò��ֹ�����
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		setTitle("FlowLayout����");
		setSize(500,500);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Window03 win=new Window03();
	}
}
