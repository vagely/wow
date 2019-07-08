package com.igeek;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * 1.下拉框
 * 2.列表框
 */

public class Window07  extends JFrame{
	
	JComboBox jComboBox;
	JList<String> jList;
	JScrollPane jScrollPane;
	JPanel jPanel,jPanel2;
	JLabel jLabel,jLabel2;
	
	public Window07() {
		String[] str= {"北京","上海","广州"};
		jComboBox=new JComboBox(str);
		
		
		String[] data= {"onre","two","three","four"};
		JList<String> jList;
		jList=new JList<String>(data);
		
		//设置显示行数
		jList.setVisibleRowCount(2);
		jScrollPane = new JScrollPane(jList);

		jPanel= new JPanel();
		jPanel2= new JPanel();
		
		jPanel.add(jComboBox);
		jPanel2.add(jScrollPane);
		
		//设置网格布局
				setLayout(new GridLayout(3,1));
				
				//添加到JFrame
				add(jPanel);
				add(jPanel2);
				
				
				setTitle("登入");
				setSize(300,150);
				setLocation(100, 50);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				//在屏幕居中显示
				setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Window07 win=new Window07();
	}

}
