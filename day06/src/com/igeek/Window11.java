package com.igeek;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window11 extends JFrame implements ActionListener {
	JButton jButton,jButton2;
	JPanel jPanel;
	public Window11() {
		super();
		jPanel = new JPanel();
		jButton = new JButton("��ɫ");
		jButton2 = new JButton("��ɫ");
		
		jButton.setActionCommand("��ɫ");
		jButton2.setActionCommand("��ɫ");
		//���ñ���
		jPanel.setBackground(Color.orange);
		
		this.add(jButton,BorderLayout.NORTH);
		this.add(jPanel,BorderLayout.CENTER);
		this.add(jButton2,BorderLayout.SOUTH);
		
		//ע�����
		//1.����������Person
		Person p=new Person(jPanel);
		jButton.addActionListener(p);
		jButton2.addActionListener(p);
		
		//2.
//		jButton.addActionListener(this);
//		jButton2.addActionListener(this);
        
		//3.
//		Person2 person2=new Person2();
//		jButton.addActionListener(person2);
//		jButton2.addActionListener(person2);
		
		
	
		
		 setTitle("Window11");
			setSize(300,150);
			setLocation(100, 50);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			//����Ļ������ʾ
			setLocationRelativeTo(null);
	
	}
	public static void main(String[] args) {
		Window11 win=new Window11();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if("��ɫ".equals(str)) {
			jPanel.setBackground(Color.BLACK);
		}else if("��ɫ".equals(str)){
			jPanel.setBackground(Color.ORANGE);
		}
		
	}
//3.	
//	class Person2 implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String str = e.getActionCommand();
//		if("��ɫ".equals(str)) {
//			System.out.println("Person2��ɫ");
//		}else if("��ɫ".equals(str)){
//			System.out.println("Person2��ɫ");
//		}
		
//  }
		
// }


	
    
}
