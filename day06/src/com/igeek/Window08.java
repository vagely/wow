package com.igeek;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

/*
 * ��ִ���
 */
public class Window08 extends JFrame {
	JSplitPane jsp;
	
	JComboBox jComboBox;
	JList<String> jList;
	
	
	JScrollPane jScrollPane;
	JPanel jPanel,jPanel2;
	JLabel jLabel,jLabel2;

	public Window08() {
		
		String[] str= {"����","�Ϻ�","����"};
		jComboBox=new JComboBox(str);
		
		
		String[] data= {"onre","two","three","four"};
		jList=new JList<String>(data);
		
		//������ʾ����
				jList.setVisibleRowCount(2);
				jScrollPane = new JScrollPane(jList);
				
				jPanel= new JPanel();
				jPanel2= new JPanel();
				
				jPanel.add(jComboBox);
				
				jPanel2.add(jScrollPane);
			//��ִ���(ˮƽ)
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jPanel,jPanel2);
	    
		add(jsp);

		setTitle("����");
		setSize(300,150);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//����Ļ������ʾ
		setLocationRelativeTo(null);
		
	
	}
	public static void main(String[] args) {
		Window08 win=new Window08();
	}
	

}
