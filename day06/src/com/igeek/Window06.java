package com.igeek;
/*
 * 1.复选框
 * 2.单选按钮
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
	JLabel jLabel,jLabel2;//3.标签
	public Window06() {
		jPanel= new JPanel();
		jPanel2= new JPanel();
		//jPanel3= new JPanel();
		
		jLabel=new JLabel("性别");
		jLabel2 = new JLabel("爱好：");
		
		jRadioButton=new JRadioButton("男");
		jRadioButton2=new JRadioButton("女");
		
		jCheckBox = new JCheckBox("足球");
		jCheckBox2 = new JCheckBox("篮球");
		jCheckBox3 = new JCheckBox("排球");
		
		//ButtonGroup
		//将jradiobutton添加进buttonGroup，保证buttonGroup中只能选中一个
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton);
		buttonGroup.add(jRadioButton2);
		
		//设置网格布局
		setLayout(new GridLayout(3,1));
		
		jPanel.add(jLabel);
		jPanel.add(jRadioButton);
		jPanel.add(jRadioButton2);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jCheckBox);
		jPanel2.add(jCheckBox2);
		jPanel2.add(jCheckBox3);
		//添加到JFrame
		add(jPanel);
		add(jPanel2);
		//add(jPanel3);
		
		setTitle("登入");
		setSize(300,150);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//在屏幕居中显示
		setLocationRelativeTo(null);
		
		
		
	}
	public static void main(String[] args) {
		Window06 win=new Window06();
	}


}
