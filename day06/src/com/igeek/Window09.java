package com.igeek;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

/*
 * 多行文本框
 */
public class Window09 extends JFrame {
	JTextArea jTextArea,jTextArea2;
	
	
	JScrollPane jScrollPane;
	
	JPanel jPanel,jPanel2;
	JLabel jLabel,jLabel2;
	
	JSplitPane jsp;
	public Window09() {
		jTextArea = new JTextArea();
		jScrollPane = new JScrollPane(jTextArea);
		
		jTextArea2=new JTextArea();
		jPanel= new JPanel();
		
		add(jTextArea2, BorderLayout.CENTER);
	    add(jScrollPane, BorderLayout.SOUTH);
	    
	    setTitle("登录");
		setSize(300,150);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//在屏幕居中显示
		setLocationRelativeTo(null);
		
	
	}
	
	public static void main(String[] args) {
		Window09 win=new Window09();
	}
	
		
	}
	


