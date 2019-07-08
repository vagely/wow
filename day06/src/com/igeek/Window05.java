package com.igeek;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Jpanel默认布局：流式布局
 * 1.文本框
 * 2.密码框
 * 3.标签
 * 需求：登录界面
 */
public class Window05 extends JFrame {
	JPanel jPanel,jPanel2,jPanel3;
	JTextField jTextField;
	JPasswordField jPasswordField;
	JLabel jLabel,jLabel2;
	JButton jButton;
	public Window05(){
		jPanel= new JPanel();
		jPanel2= new JPanel();
		jPanel3= new JPanel();
		
		
		jLabel=new JLabel("用户名");
		jLabel2 = new JLabel("密码：");
		jTextField = new JTextField(10);
		jPasswordField = new JPasswordField(10);
		jButton = new JButton("登入");

	
		//设置网格布局
				setLayout(new GridLayout(3,1));
				//组件添加到panel
				jPanel.add(jLabel);
				jPanel.add(jTextField);
				
				jPanel2.add(jLabel2);
				jPanel2.add(jPasswordField);
				//java.lang.NullPointerException,空指针异常
				jPanel3.add(jButton);
				
				//添加到JFrame
				add(jPanel);
				add(jLabel2);
				add(jPanel3);
				
				
				setTitle("登入");
				setSize(300,150);
				setLocation(100, 50);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				//在屏幕居中显示
				setLocationRelativeTo(null);
	   }
	
	public static void main(String[] args) {
		Window05 win=new Window05();
	}

}
