package com.igeek;
/*
 * 1.��ѡ��
 * 2.��ѡ��ť
 */

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Window06 extends JFrame {
	JRadioButton jRadioButton,jRadioButton2;
	JCheckBox jCheckBox,jCheckBox2,jCheckBox3;
	JPanel jPanel,jPanel2,jPanel3;
	JLabel jLabel,jLabel2;//3.��ǩ
	public Window06() {
		jPanel= new JPanel();
		jPanel2= new JPanel();
		//jPanel3= new JPanel();
		
		jLabel=new JLabel("�Ա�");
		jLabel2 = new JLabel("���ã�");
		
		jRadioButton=new JRadioButton("��");
		jRadioButton2=new JRadioButton("Ů");
		
		jCheckBox = new JCheckBox("����");
		jCheckBox2 = new JCheckBox("����");
		jCheckBox3 = new JCheckBox("����");
		
		//ButtonGroup
		//��jradiobutton��ӽ�buttonGroup����֤buttonGroup��ֻ��ѡ��һ��
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton);
		buttonGroup.add(jRadioButton2);
		
		//�������񲼾�
		setLayout(new GridLayout(3,1));
		
		jPanel.add(jLabel);
		jPanel.add(jRadioButton);
		jPanel.add(jRadioButton2);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jCheckBox);
		jPanel2.add(jCheckBox2);
		jPanel2.add(jCheckBox3);
		//��ӵ�JFrame
		add(jPanel);
		add(jPanel2);
		//add(jPanel3);
		
		setTitle("����");
		setSize(300,150);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//����Ļ������ʾ
		setLocationRelativeTo(null);
		
		
		
	}
	public static void main(String[] args) {
		Window06 win=new Window06();
	}


}
