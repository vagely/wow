package com.igeek;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * JpanelĬ�ϲ��֣���ʽ����
 * 1.�ı���
 * 2.�����
 * 3.��ǩ
 * ���󣺵�¼����
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
		
		
		jLabel=new JLabel("�û���");
		jLabel2 = new JLabel("���룺");
		jTextField = new JTextField(10);
		jPasswordField = new JPasswordField(10);
		jButton = new JButton("����");

	
		//�������񲼾�
				setLayout(new GridLayout(3,1));
				//�����ӵ�panel
				jPanel.add(jLabel);
				jPanel.add(jTextField);
				
				jPanel2.add(jLabel2);
				jPanel2.add(jPasswordField);
				//java.lang.NullPointerException,��ָ���쳣
				jPanel3.add(jButton);
				
				//��ӵ�JFrame
				add(jPanel);
				add(jLabel2);
				add(jPanel3);
				
				
				setTitle("����");
				setSize(300,150);
				setLocation(100, 50);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				//����Ļ������ʾ
				setLocationRelativeTo(null);
	   }
	
	public static void main(String[] args) {
		Window05 win=new Window05();
	}

}
