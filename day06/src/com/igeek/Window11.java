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
		jButton = new JButton("黑色");
		jButton2 = new JButton("橘色");
		
		jButton.setActionCommand("黑色");
		jButton2.setActionCommand("橘色");
		//设置背景
		jPanel.setBackground(Color.orange);
		
		this.add(jButton,BorderLayout.NORTH);
		this.add(jPanel,BorderLayout.CENTER);
		this.add(jButton2,BorderLayout.SOUTH);
		
		//注册监听
		//1.创建对象类Person
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
			//在屏幕居中显示
			setLocationRelativeTo(null);
	
	}
	public static void main(String[] args) {
		Window11 win=new Window11();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if("黑色".equals(str)) {
			jPanel.setBackground(Color.BLACK);
		}else if("橘色".equals(str)){
			jPanel.setBackground(Color.ORANGE);
		}
		
	}
//3.	
//	class Person2 implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String str = e.getActionCommand();
//		if("黑色".equals(str)) {
//			System.out.println("Person2黑色");
//		}else if("橘色".equals(str)){
//			System.out.println("Person2橘色");
//		}
		
//  }
		
// }


	
    
}
